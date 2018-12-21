# -*- coding: utf-8 -*-

# -*- coding: utf-8 -*-
import pandas as pd
import numpy as np
from util import PATH

def make_food_weight():
    food_content = PATH + "db\\food_content_analysis_detail.xlsx"
    
    data = pd.read_excel(food_content)
    
    DF = data.count()[2:]
    IDF = DF.sum()/ DF
    IDF = np.log10(IDF)
    
    data["sum"] = data.count(axis=1)-2
    
    for column in data.columns[2:-1]:
        data[column] = data[column]/ data["sum"]**0.5
        
    data = data.iloc[:,:-1]
    
    for index in data.index:
        data.iloc[index,2:] = data.iloc[index,2:] * IDF
        
    data.to_excel(PATH+"db\\food_weight.xlsx",index=None,encoding="euc-kr")
