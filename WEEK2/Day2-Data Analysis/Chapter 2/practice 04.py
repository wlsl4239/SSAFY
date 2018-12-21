# 단어어 해당 단어의 빈도수를 담은 리스트를 선언합니다. 수정하지 마세요.
pairs = [
    ('time', 8),
    ('the', 15),
    ('turbo', 1),
]

def get_freq(pair):
    '''
    (단어, 빈도수) 쌍으로 이루어진 튜플을 받아, 빈도수를 리턴합니다.
    
    >>> get_freq(('time', 8))
    8
    '''
    
    return pair[1]


def sort_by_frequency(pairs):
    '''
    (단어, 빈도수) 꼴 튜플의 리스트를 받아, 빈도수가 낮은 순서대로 정렬하여 리턴합니다.
    
    >>> sort_by_frequency(pairs)
    [('turbo', 1), ('time', 8), ('the', 15)]
    '''
    
    return sorted(pairs, key=get_freq)


# 아래 주석을 해제하고 결과를 확인해보세요.  
print(sort_by_frequency(pairs))

'''
데이터 정렬하기
sorted()를 활용하면 리스트를 특정 기준에 맞춰 정렬할 수 있습니다. 이때 기준은 key에 저장한 함수를 따르게 됩니다.

아래의 코드는 숫자의 리스트를 절댓값을 기준으로 정렬합니다. 여기서 abs() 함수는 절댓값을 리턴하는 파이썬 내장 함수입니다.
'''

'''
데이터 분석에 응용하기
단어의 사용 빈도를 쉽게 확인하기 위해서는 단어를 빈도 순서대로 정렬해야 합니다.

None을 삭제하고 이 작업에 필요한 함수 get_freq()와 sort_by_frequency() 함수를 완성하세요.
'''
