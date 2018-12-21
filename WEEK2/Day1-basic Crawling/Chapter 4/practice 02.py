from elice_utils import EliceUtils

elice_utils = EliceUtils()
from matplotlib import pyplot as plt


def main():
    print("비교 차트 그리기")

    plt.xlabel("person")
    plt.ylabel("grade")

    # Python
    plt.plot(['a','b','c','d','e'],[100,95,50,30,80])

    # Java
    plt.plot(['a','b','c','d','e'],[60,30,40,85,20])

    plt.savefig("image.svg", format="svg")
    elice_utils.send_image("image.svg")


if __name__ == "__main__":
    main()

'''
비교 차트 그리기
2가지의 데이터셋을 시각화해서 비교하는 방법을 실습해봅니다.

Java와 Python을 a,b,c,d,e라는 5명의 학생의 점수를

한눈에 알아보기 쉽게 그래프를 그려봅니다.


'''
