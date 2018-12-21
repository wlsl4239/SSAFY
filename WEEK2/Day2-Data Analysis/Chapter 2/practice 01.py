# 텍스트 파일을 불러옵니다.
corpus = 'corpus.txt'

def print_lines(filename):
    '''
    파일의 내용을 줄 번호와 한 줄씩 출력합니다.
    
    >>> print_lines(corpus)
    1 zoo,768
    2 zones,1168
    3 zone,2553
    '''
    
    line_number = 1
    # 아래 코드를 작성하세요.
    with open(filename) as file:
        for line in file:
            print(str(line_number)+' '+line)
            # 1 This is Elice. 와 같이, "(줄번호) (내용)" 형식으로 출력합니다.
            
            line_number += 1


# 아래 주석을 해제하고 결과를 확인해보세요.  
print_lines(corpus)


'''
파일 열고 읽기
open()을 이용하면 지정한 파일 이름에 해당하는 파일을 열고, 읽거나 수정할 수 있습니다.

여기에 with ... as을 사용하면 파일을 자동으로 닫을 수 있고, for문을 사용하면 파일 내용을 한 줄씩 읽을 수 있습니다.
'''

'''
데이터 분석에 응용하기
영어 단어 데이터를 분석하려면, 먼저 데이터 저장된 파일을 파이썬으로 읽어 와야 합니다.

파일의 내용을 각 줄의 번호와 함께 출력하는 print_lines() 함수를 완성하세요.
'''
