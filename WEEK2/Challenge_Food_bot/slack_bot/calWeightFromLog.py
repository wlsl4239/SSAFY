# -*- coding: utf-8 -*-
from util import PATH, EPSILON
import pandas as pd
import numpy as np
import warnings
warnings.filterwarnings("ignore")
def getFoodData():
    data = pd.read_excel(PATH+"db\\food_data.xlsx")
    
    temp = []
    foodCategoryList = list(data["category"].unique())
    
    foodTypeList = []
    for i in range(len(data)):
        food = data.iloc[i,:]
        temp2 = []
        for j in food["type"].split(" "):
            temp2.append(j)
            if j not in foodTypeList:
                foodTypeList.append(j)
        temp.append(temp2)
    
    data["typeCombine"] = temp

    return foodCategoryList, foodTypeList, data

def getBaseWeight():
    foodCategoryList, foodTypeList, data = getFoodData()
    for type1 in foodTypeList:
        temp =[]
        for index in data["typeCombine"].index:
            if type1 in data["typeCombine"][index]:
                temp.append(index)
        data[type1] = False
        for index in temp:
            data[type1][index]= True
    
    temp = data["category"]
    typeData = data.iloc[:,[5,6,7,8,9,10,11,12,13,14,15,16]][data==True].values
    
    
    for i in range(len(typeData)):
        temp = typeData[i]
        typeData[i] = (temp / np.count_nonzero(temp==True))
    
    data.iloc[:,[5,6,7,8,9,10,11,12,13,14,15,16]] = typeData
    
    data["weight"] = 1 / len(data["food_id"])
    baseWeight = data.iloc[:,[0,len(data.columns)-1]].copy()
    
    return foodCategoryList, foodTypeList, data, baseWeight

def needDataProcess(needData, data):
    approved = needData[needData["choice"]==1]
    disapproved = needData[needData["choice"]==0]
    baseDF = pd.DataFrame(list(range(1,len(data)+1)),columns=["food_id"])
    baseDF["count"] = 0
    for i in approved["food_id"].values:
        baseDF["count"][i-1] += 1
    for i in disapproved["food_id"].values:
        baseDF["count"][i-1] += -1
    return baseDF

foodCategoryList, foodTypeList, data, baseWeight = getBaseWeight()


def calWeightFromLog(id_code):
    logData = pd.read_excel(PATH + "db\\output_log.xlsx")
    global foodCategoryList, foodTypeList, data, baseWeight
    needData = logData[logData["id_code"] == id_code]
    if len(needData) <=10:
        return baseWeight, data
    foodWeight = pd.read_excel(PATH+"db\\food_weight.xlsx")
    foodWeight.fillna(0,inplace=True)
    
    processed = needDataProcess(needData,data)
    foodWeight["count"] = processed["count"]
    
    contentList = []
    for i in foodTypeList:
        contentList.append(i)
    for i in foodCategoryList:
        contentList.append(i)
    foodWeight_part = foodWeight.loc[:,contentList]
    userRow = np.dot(np.array([foodWeight["count"].values]),foodWeight_part.values)
    result = foodWeight_part.dot(userRow.T)
    result[result<0] = 0
    resultDF = baseWeight
    resultDF.loc[:,["weight"]] = result.loc[:,0]
    resultDF.loc[:,["weight"]] = resultDF.loc[:,["weight"]] / resultDF.loc[:,["weight"]].sum()
    resultDF.loc[:,["weight"]] = resultDF.loc[:,["weight"]] * (1-EPSILON)
    zeroDF = resultDF.loc[:,["weight"]][resultDF["weight"]==0]
    if not len(zeroDF) == 0:
        zeroDF.loc[:,["weight"]] = EPSILON / len(zeroDF)
        resultDF.iloc[zeroDF.index,:] = zeroDF
        resultDF["food_id"] = list(range(1,len(data)+1))
    return resultDF, data

#id_code="UEXHE2WQM"