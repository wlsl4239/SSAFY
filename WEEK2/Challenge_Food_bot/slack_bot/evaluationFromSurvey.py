# -*- coding: utf-8 -*-
import pandas as pd
import numpy as np
from util import WEIGHT, PATH
import matplotlib.pyplot as plt
import matplotlib
font_name = matplotlib.font_manager.FontProperties(fname='C:\\Windows\\Fonts\\malgun.ttf').get_name()
plt.rcParams["font.family"] = font_name

def evaluation(survey):
    basePath = WEIGHT
    weight = pd.read_excel(basePath)
    response = pd.read_excel(survey)
    
    responseList = []
    for index in response.index:
        temp = response.iloc[index,4:]
        temp = temp.sort_index()
        temp.index = range(0,30)
        responseList.append(temp)
    
    preferenceList = []
    
    for response1 in responseList:
        w = responseList[1]    
        profile = []
        for column in weight.columns[2:]:
            profile.append((weight[column] * w).sum())
        
        preference = (weight.iloc[:,2:] * profile).sum(axis=1)
        preference = preference / preference.sum()
        preferenceList.append(preference)
    
    compareList = []
    pointList = []
    for i in range(len(responseList)):
        tempData = weight.iloc[:,[0,1]].copy()
        tempData["response"] = responseList[i]
        tempData["preference"] = preferenceList[i]
        positiveCount = tempData["response"][tempData["response"]==1].count()
        positRate = positiveCount / tempData["response"].count() 
        calData = tempData.sort_values("preference",ascending=False)[:positiveCount]
        evaluateRate = calData["response"][calData["response"]==1].count() / positiveCount
        finalPoint = round(evaluateRate - positRate,5)
        compareList.append(positRate)
        pointList.append(finalPoint)
    
    compareList = np.array(compareList)
    pointList = np.array(pointList)
    algList = compareList + pointList
    #pointList = pd.Series(pointList[pointList!=0])
    #pointListSamp = pointList.sample(frac=0.7)
    result = "{0:.4f}%".format(float(round(pointList.mean(),4) * 100))
    algResult = "{0:.4f}%".format(float(round(algList.mean(),4) * 100))
    meanPreference = "{0:.4f}%".format(float(round(compareList.mean(),4) * 100))
    x = np.arange(0,len(compareList))
    y = compareList.tolist()
    z= algList.tolist()
    
    fig = plt.figure(figsize=(10,8))
    plt.bar(x, y,width=0.2,color='b',align='center', label="yes/total 비율",  edgecolor ="k")
    plt.bar(x+0.2, z,width=0.2,color='r',align='center', label="추천 알고리즘 성능",  edgecolor ="k")
    plt.legend()
    plt.title("yes/total 비율과 추천알고리즘 성능 비교",size=20)
    plt.xlabel("case", size=20)
    plt.ylabel("rate", size=20)
    plt.xticks(x, size=15)
    plt.tight_layout()
#    plt.show()
    plt.savefig(PATH+"evalutaion")
    
    return result, algResult, meanPreference

survey = PATH + "db\\food_selection_responses2.xlsx"
results = evaluation(survey)


