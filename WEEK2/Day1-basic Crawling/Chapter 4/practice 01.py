from elice_utils import EliceUtils

elice_utils = EliceUtils()
import matplotlib.pyplot as plt
import numpy as np


def main():
    x = [1,9]
    y = [1,9]

    plt.plot(x, y)
    plt.xlabel('x_chuck')
    plt.ylabel('y_chuck')
    plt.title('sample_chart')

    plt.savefig("image.svg", formate="svg")
    elice_utils.send_image("image.svg")


if __name__ == "__main__":
    main()


'''
간단한 차트 한번 그려보기
matplotlib 라이브러리를 사용해서 간단하게

차트를 그리는 코딩을 해봅니다.

파이썬에서 데이터를 가지고 시각화가 가능하다는 것을 직접 코딩으로 알아봅니다.
'''
