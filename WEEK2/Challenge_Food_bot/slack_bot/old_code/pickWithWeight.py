# -*- coding: utf-8 -*-

import numpy as np
import pandas as pd
import datetime
from util import FOOD_DATA, OUTPUT
from calWeightFromLog import calWeightFromLog

def pick_randomWeight_from_list(food_id_Series,weightSeries):
    "from food_id_list pick food_id with weight"
    food_id = np.random.choice(food_id_Series,1,p=weightSeries)
    return food_id


def yes_or_no_loop(data,id_code,weights):
    noChoiceList = []
    choice = 0
    print("\n음식을 추천해드립니다!\n")
    while(choice == 0):
        if len(noChoiceList) == list(data["food_id"])[-1]:
            print("더 이상 추천해줄 음식이 없습니다.")
            choice = "EXIT"
            break
        
        food_id = pick_randomWeight_from_list(list(weights["food_id"]),list(weights["weight"]))
        index = list(data["food_id"].values).index(food_id)
        randomFood, pickedCategory = data["food"][index], data["category"][index]
        
        #골랐던 음식이 마음에 안든 경우 이를 제외 추천
        if randomFood in noChoiceList:
            continue
        print(pickedCategory,"-",randomFood)
        choice = "yes"
        
#        while(True):
#            choice = input("Yes or No? ")
#            choice = choice.upper()
#            if choice in ["Y","YES","EXIT"]:
#                break
#            elif choice in ["N", "NO"]:
#                print()
#                choice = 0
#                noChoiceList.append(randomFood)
#                break
#            else:
#                print("Wrong Input")
        
    if choice == "EXIT":
        randomFood = "Dump"
    return randomFood, noChoiceList

def pick_main(id_code):
    food_data = pd.read_excel(FOOD_DATA)
    try:
        log_data= pd.read_excel(OUTPUT)    
    except:
        log_data = pd.DataFrame(columns=["id_code","food_id","choice","time"])
    weights = calWeightFromLog(id_code)[0]
#    print(weights)
    randomFood, noChoiceList = yes_or_no_loop(food_data, id_code,weights)
    for food in noChoiceList:
        food_id = food_data.loc[food_data["food"]==food]["food_id"].values[0]
        log_data = log_data.append({"id_code":id_code, "food_id":food_id, "choice":0, "time":datetime.datetime.now()},ignore_index=True)
    if randomFood == "Dump":
        pass
    else:
        food_id = food_data.loc[food_data["food"]==randomFood]["food_id"].values[0]
        log_data = log_data.append({"id_code":id_code, "food_id":food_id, "choice":1, "time":datetime.datetime.now()},ignore_index=True)
    #return log_data
    log_data.to_excel(OUTPUT, index=None)
    #return log_data
for i in range(1):
    pick_main(1)
#id_code = 1