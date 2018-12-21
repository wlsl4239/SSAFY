from elice_utils import EliceUtils

elice_utils = EliceUtils()


def main():
    sentence1 = "오늘은 날씨가 좋네요."
    sentence2 = "서울에 날씨가 좋네요."
    sentence3 = "부산에 날씨가 나쁘네요."

    # replace를 이용해서 "날씨"를 "공기"로 변경해서 출력해보기

    print(sentence1.replace("날씨","공기"))
    print(sentence2.replace("날씨","공기"))
    print(sentence3.replace("날씨","공기"))

    # split을 이용하여 문장을 끊어서
    # "오늘은 서울에 날씨가 나쁘네요." 문장 만들어보기

    print(sentence1.split()[0] +" "+ sentence2.split()[0] +" "+ sentence2.split()[1] +" "+ sentence3.split()[2])


if __name__ == "__main__":
    main()

'''
문자열 가공 실습
간단하게 몇가지 문자열 실습을 해봅니다.
'''
