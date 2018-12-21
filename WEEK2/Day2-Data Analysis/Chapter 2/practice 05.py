# matplotlib의 일부인 pyplot 라이브러리를 불러옵니다.
import matplotlib.pyplot as plt
import numpy
# 엘리스에서 차트를 그릴 때 필요한 라이브러리를 불러옵니다.
from elice_utils import EliceUtils
elice_utils = EliceUtils()

# 월별 평균 기온을 선언합니다. 수정하지 마세요.
years = [2013, 2014, 2015, 2016, 2017]
temperatures= [[5, 10, 15, 20, 17],[10,2,5,7,8],[9,15,30,6,2],[24,28,23,10,15],[5,7,1,12,6]]


def draw_graph():
    '''
    막대 차트를 출력합니다.
    '''
    
    # 막대 그래프의 막대 위치를 결정하는 pos를 선언합니다.
    pos = range(len(years))  # [0, 1, 2, 3, 4]
    avg = []            # 평균
    mintemp = []        # 최소온도
    maxtemp = []        # 최대온도
    for i in temperatures:
        avg.append(sum(i)/len(i))
        mintemp.append(min(i))
        maxtemp.append(max(i))
        
    # 높이가 온도인 막대 그래프를 그립니다.
    # 각 막대를 가운데 정렬합니다.
    plt.bar(pos, avg, align='center',yerr=pos, label='temperature_avg', color='skyblue')
    plt.plot(pos, mintemp, label='min_temperature')
    plt.plot(pos, maxtemp, label='max_temperature')
    # 각 막대에 해당되는 연도를 표기합니다.
    plt.xticks(pos, years)
    plt.legend()
    # 그래프를 엘리스 플랫폼 상에 표시합니다.
    plt.savefig('graph.png')
    elice_utils.send_image('graph.png')

print('막대 차트를 출력합니다.')
draw_graph()


'''
차트 그리기
파이썬의 matplotlib 라이브러리를 이용하면 막대 차트, 꺾은선 차트 등 다양한 차트를 쉽게 그릴 수 있습니다.
'''

'''
데이터 분석에 응용하기
영어 단어의 빈도수를 쉽게 비교하기 위해서는 한 눈에 들어오는 그래프를 그려야 합니다.

matplotlib의 bar() 메소드를 이용하여 최근 평균 기온 그래프를 간단히 그려 보겠습니다. 코드와 주석을 이해한 후 출력된 차트를 확인해 보세요.
'''
