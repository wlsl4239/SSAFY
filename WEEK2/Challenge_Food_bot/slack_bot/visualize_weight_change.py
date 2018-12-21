# -*- coding: utf-8 -*-

import pandas as pd
#from matplotlib import pyplot as plt
import numpy as np
from util import PATH, EPSILON
from calWeightFromLog import needDataProcess, getBaseWeight
#import matplotlib.font_manager as fm
#import matplotlib
import plotly
import plotly.plotly
import plotly.graph_objs as go
plotly.tools.set_credentials_file(username='tapu1125', api_key='LTuDFLn7Gaxlr1YY1eIe')
#font_name = matplotlib.font_manager.FontProperties(fname='C:\\Windows\\Fonts\\malgun.ttf').get_name()
#plt.rcParams["font.family"] = font_name
foodCategoryList, foodTypeList, data, baseWeight = getBaseWeight()


def calWeightFromNLog(id_code, N):
    logData = pd.read_excel(PATH + "db\\output_log.xlsx")
    global foodCategoryList, foodTypeList, data, baseWeight
    baseWeight_ = baseWeight.copy()
    needData = logData[logData["id_code"] == id_code]
    needData = needData.iloc[:N,:]
    if len(needData) <=10:
        return baseWeight_, data
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
    resultDF = baseWeight.copy()
    resultDF.loc[:,["weight"]] = result.loc[:,0]
    resultDF.loc[:,["weight"]] = resultDF.loc[:,["weight"]] / resultDF.loc[:,["weight"]].sum()
    resultDF.loc[:,["weight"]] = resultDF.loc[:,["weight"]] * (1-EPSILON)
    zeroDF = resultDF.loc[:,["weight"]][resultDF["weight"]==0]
    if not len(zeroDF) == 0:
        zeroDF.loc[:,["weight"]] = EPSILON / len(zeroDF)
        resultDF.iloc[zeroDF.index,:] = zeroDF
        resultDF["food_id"] = list(range(1,len(data)+1))
    return resultDF, data

def plotAndMakeURL(id_code):
    logData = pd.read_excel(PATH + "db\\output_log.xlsx")
    needData = logData[logData["id_code"] == id_code]
    
    weightList = []
    for N in range(len(needData)): 
        weightDF = calWeightFromNLog(id_code,N)[0]
        weightList.append(weightDF["weight"].values)

    foodList = []
    for i in data.loc[:,["food"]].values:
        foodList.append(i[0])
        
    data2 = [dict(visible = False,name = '𝜈 = '+str(step),
            x = foodList,
            y = weightList[step]) for step in range(len(weightList))]
    data3 = []
    for i in data2:
        data3.append(go.Bar(**i))
    
    steps = []
    for i in range(len(data3)):
        step = dict(
            method = 'restyle',  
            args = ['visible', [False] * len(data3)],
        )
        step['args'][1][i] = True # Toggle i'th trace to "visible"
        steps.append(step)
    
    sliders = [dict(
        active = 0,
        currentvalue = {"prefix": "N개 반영: "},
        pad = {"t": 50},
        steps = steps
    )]
    
    layout = dict(sliders=sliders,xaxis=dict(title="음식"), yaxis=dict(range=[0,0.2]),title="가중치")
    
    fig = dict(data=data3, layout=layout)
    plot_url = plotly.plotly.plot(fig, filename= '음식 가중치',auto_open=False)
    plot_url += ".embed"
    return plot_url