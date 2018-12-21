import matplotlib.pyplot as plt
import matplotlib.font_manager as fm

from elice_utils import EliceUtils
elice_utils = EliceUtils()

# 날짜 별 온도 데이터를 세팅합니다.
dates = ["1월 {}일".format(day) for day in range(1, 32)]
temperatures = list(range(1, 32))

# 막대 그래프의 막대 위치를 결정하는 pos를 선언합니다.
pos = range(len(dates))

# 한국어를 보기 좋게 표시할 수 있도록 폰트를 설정합니다.
font = fm.FontProperties(fname='./NanumBarunGothic.ttf')

# 막대의 높이가 빈도의 값이 되도록 설정합니다.
plt.bar(pos, temperatures, align='center')

# 각 막대에 해당되는 단어를 입력합니다.
plt.xticks(pos, dates, rotation='vertical', fontproperties=font)

# 그래프의 제목을 설정합니다.
plt.title('1월 중 기온 변화', fontproperties=font)

# Y축에 설명을 추가합니다.
plt.ylabel('온도', fontproperties=font)

# 단어가 잘리지 않도록 여백을 조정합니다.
plt.tight_layout()

# 그래프를 표시합니다.
plt.savefig('graph.png')
elice_utils.send_image('graph.png')

'''
matplotlib으로 차트 설정하기
파이썬의 차트 라이브러리인 matploblib에 대해서 더 자세히 알아봅시다. matplotlib 라이브러리는 단순히 차트를 그리는 것뿐만 아니라, 차트에 더 많은 정보를 추가하고 보기 좋게 만드는 다양한 기능을 제공하고 있습니다.

한국어 표시를 위해 폰트 설정하기
차트의 제목 설정하기
X축과 Y축에 라벨 표시하기
차트의 여백 조정하기
'''
