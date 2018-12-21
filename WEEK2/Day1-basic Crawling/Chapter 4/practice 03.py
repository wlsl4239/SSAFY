from elice_utils import EliceUtils

elice_utils = EliceUtils()
import numpy as np
import matplotlib.pyplot as plt


def main():
    print("----산포도1----")

    x = np.arange(0, 100)
    y = np.arange(0, 100)
    plt.plot(x, y, "o")     #plt.plot(x, y, "k") 

    plt.savefig("image1.svg", format="svg")
    elice_utils.send_image("image1.svg")
    
    print("----산포도2----")

    line = plt.figure()

    np.random.seed(5)
    x = np.arange(1, 101)
    y = 20 + 3 * x + np.random.normal(0, 40, 100)
    plt.plot(x, y, "o")
    plt.show()

    plt.savefig("image2.svg", format="svg")
    elice_utils.send_image("image2.svg")
    
    print("----파이차트----")

    slices_hours = [12.5, 25, 62.5]
    activities = ["Sleep", "Work", "Nothing"]

    color = ["gray", "blue", "red"]

    plt.pie(slices_hours, labels=activities, colors=color, startangle=90, autopct='%.1f%%')

    plt.savefig("image3.svg", format="svg")
    elice_utils.send_image("image3.svg")


if __name__ == "__main__":
    main()


'''
다양한 차트 그려보기
선으로 된 차트 뿐만이 아니라 산포도, 파이차트를 직접 그려보면서

다양한 차트를 그리는 것이 가능하다는 것을 알아보고

차트 그리는 것에 익숙해집니다.
'''
