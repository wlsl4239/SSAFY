# 트럼프 대통령의 트윗으로 구성된 문자열입니다. 수정하지 마세요. 
trump_tweets = "thank you to president moon of south korea for the beautiful welcoming ceremony it will always be remembered"

def break_into_words(text):
    '''
    공백 기준으로 분리된 문자열을 리스트형으로 반환합니다. 
    
    >>> break_into_words('merry christmas')
    ['merry', 'christmas']
    '''
    
    # 아래 코드를 작성하세요.
    words = text.split()
    
    
    return words


# 아래 주석을 해제하고 결과를 확인해보세요.  
print(break_into_words(trump_tweets))


'''
문장을 단어 단위로 구분하기
split() 메소드는 특정 문자를 기준으로 문자열을 분리합니다. 입력값을 넣지 않을 경우 공백을 기준으로 분리합니다. 분리된 문자열은 리스트의 원소로 저장됩니다.
'''

'''
데이터 분석에 응용하기
트윗에 사용된 단어를 하나씩 살펴보기 위해서는 문자열을 리스트로 변환해야 합니다.

trump_tweet을 공백을 기준으로 분리하고 리스트형으로 반환하는 break_into_words() 함수를 수정하세요.
'''
