# -*- coding: utf-8 -*-

import pandas as pd
from util import LOCLOG
def initialize():
    log_data = pd.DataFrame(columns=["id_code","location"])
    log_data.to_csv(LOCLOG, index=None)   