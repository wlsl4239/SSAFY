from elice_utils import EliceUtils

elice_utils = EliceUtils()


def main():
    text_one = "나는 짜장면을 좋아합니다."
    print(text_one)
    
    llist = text_one.split()
    print(llist)
    
    text_two = text_one.replace('짜장면','짬뽕')
    text_two = text_two.replace('나','너')
    print(text_two)

if __name__ == "__main__":
    main()

'''
간단한 문자열 테크닉 실습
문자열을 가공하는 기법에 대해 간단하게 몇가지 예제를 실습해봅니다.

“문자열” + “문자열” 로 문자열을 합쳐보거나

split()함수를 이용해서 문장을 단어별로 분리해보거나

replace() 함수를 이용해서, 문자열을 대체해보는 실습을 해봅니다.
'''
 
