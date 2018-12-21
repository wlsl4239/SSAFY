from elice_utils import EliceUtils

elice_utils = EliceUtils()
import re


def main():
    # 정규식을 통해, 사람들의 연락처 중 010을 제거하고 남은 부분
    # ex 01012341234 중 12341234를 추출하는 문제를 풀어봅니다

    # 정규식을 이용해 숫자만을 추출한 후, 010 부분을 제거합니다.

    sentence = "앨리스 : 01012341234,홍길동 01011112222, 박보검 01088885555"

    compile_text = re.compile("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]")
    match_text = compile_text.findall(sentence)

    numbers = []

    numbers.append(match_text[0][3:])
    numbers.append(match_text[1][3:])
    numbers.append(match_text[2][3:])

    print(numbers)


# 결과물 : 12341234, 11112222, 88885555


if __name__ == "__main__":
    main()
    
    
    
    
'''
정규식 문제
우리는 앞 수업에서 정규식을 배워보았습니다.

이제 직접 정규식을 통해 원하는 정보만을 가져와보는 문제를 풀어봅니다.
'''
