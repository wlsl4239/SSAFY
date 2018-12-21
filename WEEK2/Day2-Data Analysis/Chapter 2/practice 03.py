# 단어 모음을 선언합니다. 수정하지 마세요.
words = [
    'apple',
    'banana',
    'alpha',
    'bravo',
    'cherry',
    'charlie',
]

def filter_by_prefix(words, prefix):
    '''
    prefix로 시작하는 word를 린턴합니다. 

    >>> filter_by_prefix(words, 'a')
    'apple'
    '''
    
    # 아래 코드를 작성하세요.
    
    
    return [i for i in words if i.startswith(prefix)]


# 아래 주석을 해제하고 결과를 확인해보세요.  
a_words = filter_by_prefix(words, 'a')
print(a_words)



'''
한 줄 명령어로 데이터 다루기
파이썬의 가장 큰 장점 중 하나는 간결한 코드입니다. for문을 리스트 안에 입력하면 새로운 리스트를 코드 한 줄로 간결하게 생성할 수 있습니다. 아래의 두 코드는 동일하게 작동합니다.
'''

'''
데이터 분석에 응용하기
None을 삭제하고 단어 모음 words에서 prefix로 시작하는 단어만 리턴하는 filter_by_prefix 함수를 완성하세요.
'''
