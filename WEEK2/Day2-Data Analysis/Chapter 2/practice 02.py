# 텍스트 파일을 불러옵니다.
corpus = 'corpus.txt'

def import_as_tuple(filename):
    '''
    (단어, 빈도수)` 튜플로 구성된 리스트를 리턴합니다.
    
    >>> import_as_tumple(corpus)
    [('zoo', '768'), ('zones', '1168'), ... ] 
    '''
    
    tuples = []
    with open(filename) as file:
        for line in file:
            # 아래 코드를 작성하세요.
            tuples.append(tuple(line.strip().split(',')))
            
            
    return tuples


# 아래 주석을 해제하고 결과를 확인해보세요.  
print(import_as_tuple(corpus))

'''
데이터 형태 변환하기
튜플(tuple)은 리스트와 비슷한 데이터 구조로, 여러 값을 모아서 저장할 수 있습니다. 단, 리스트와 다르게 () 안에 요소가 입력되며 한 번 생성한 튜플은 그 값을 변경할 수 없습니다.
'''

'''
데이터 분석에 응용하기
corpus.txt의 내용을 읽고 (단어, 빈도수) 튜플로 구성된 리스트를 리턴하는 import_as_tuple() 함수를 완성하세요.
'''
