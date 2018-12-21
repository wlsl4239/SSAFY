from elice_utils import EliceUtils

elice_utils = EliceUtils()
import re


def main():
    sentence = "제보는 032-232-3245 또는 010-222-2233 으로 연락주시기 바랍니다."

    compile_text = re.compile(r'\d\d\d-\d\d\d-\d\d\d\d')
    match_text = compile_text.findall(sentence)
    print(match_text)

    email = ["aa2@naver.com", "kbc@aaaaa", "Alice@Alice.com", "ILove@CodingLove"]

    compile_text = re.compile(r"[a-zA-Z0-9+-_]+@[a-zA-Z0-9+-_]+\.[a-zA-Z0-9+-_]+")

    for i in email:
        print(compile_text.match(i) != None)


if __name__ == "__main__":
    main()

'''
정규식 알아보기
정규식을 사용하여, 원하는 정보만 수집하는 방법과

수집한 데이터가 원하는 형태인지 검사하는 방법을 알아봅니다.

“010-000-0000” 와 같은 숫자 3개 3개 4개 로 구성된 문자열만을

문장에서 찾아 출력해보거나

elice@elice.com과 같은 이메일의 양식이 올바른지 검사하는 프로그램을 만들어봅니다.
'''
 
