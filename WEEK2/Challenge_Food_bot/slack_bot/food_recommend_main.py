# -*- coding: utf-8 -*-

from util import PATH
from cbfWeightCal import make_food_weight

import os
exists = os.path.isfile(PATH+'db/food_weight.xlsx')

if not exists:
    make_food_weight()



