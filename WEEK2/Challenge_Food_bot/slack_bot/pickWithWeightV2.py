# -*- coding: utf-8 -*-

import numpy as np
import pandas as pd
import datetime
from util import FOOD_DATA, OUTPUT
from calWeightFromLog import calWeightFromLog

def initialize():
    log_data = pd.DataFrame(columns=["id_code","food_id","choice","time"])
    log_data.to_excel(OUTPUT, index=None)    

def pick_randomWeight_from_list(food_id_Series,weightSeries):
    "from food_id_list pick food_id with weight"
    food_id = np.random.choice(food_id_Series,1,p=weightSeries)
    return food_id


def getFood(data,id_code,weights):    
    food_id = pick_randomWeight_from_list(list(weights["food_id"]),list(weights["weight"]))
    index = list(data["food_id"].values).index(food_id)
    randomFood = data["food"][index]
    return randomFood

def pick_main(id_code):
    id_code = str(id_code)
    food_data = pd.read_excel(FOOD_DATA)
    try:
        log_data= pd.read_excel(OUTPUT)    
    except:
        log_data = pd.DataFrame(columns=["id_code","food_id","choice","time"])
        log_data.to_excel(OUTPUT, index=None)
        
    weights = calWeightFromLog(id_code)[0]    
    print(weights)
    randomFood = getFood(food_data, id_code,weights)
    food_id = food_data.loc[food_data["food"]==randomFood]["food_id"].values[0]
    log_data = log_data.append({"id_code":id_code, "food_id":food_id, "choice":1, "time":datetime.datetime.now()},ignore_index=True)
    log_data.to_excel(OUTPUT, index=None)
    return randomFood

#for i in range(1):
#    pick_main(1)
#id_code = 1
