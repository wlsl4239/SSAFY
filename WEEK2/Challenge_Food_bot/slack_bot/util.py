# -*- coding: utf-8 -*-
import os
import re
home = os.path.dirname(os.path.abspath(__file__))
PATH = home + "\\"
OUTPUT = PATH + "db\\output_log.xlsx"
LOCLOG = PATH + "db\\location_log.csv"
IMAGEDF = PATH + "db\\imageList.xlsx"
IMAGEPATH = PATH + "images\\"
FOOD_DATA = PATH + "db\\food_data.xlsx"
WEIGHT= PATH+"db\\food_weight.xlsx"
STRENGTH = 2
IDDB = PATH + "db\\id_db_log.xlsx"
EMAIL_REGEX = re.compile(r"[^@]+@[^@]+\.[^@]+")
EPSILON = 0.05