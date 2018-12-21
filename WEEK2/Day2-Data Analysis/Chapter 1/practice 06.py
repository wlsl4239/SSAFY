# 트럼프 대통령의 트윗 세개로 구성된 리스트입니다. 수정하지 마세요.
trump_tweets = [
    "FAKE NEWS - A TOTAL POLITICAL WITCH HUNT!",
    "Any negative polls are fake news, just like the CNN, ABC, NBC polls in the election.",
    "The Fake News media is officially out of control.",
]
 
def lowercase_all_characters(text):
    '''
    리스트에 저장된 문자열을 모두 소문자로 변환합니다.
    
    >>> lowercase_all_characters(['FAKE NEWS', 'Fake News'])
    ['fake news', 'fake news']
    '''
    
    processed_text = []
    # 아래 코드를 작성하세요.
    
    for i in text:
        processed_text.append(i.lower())
    
    
    
    return processed_text


# 아래 주석을 해제하고 결과를 확인해보세요.  
print('\n'.join(lowercase_all_characters(trump_tweets)))

'''
대소문자 변환하기
lower(), upper() 메소드를 이용하면 문자열을 쉽게 소문자 또는 대문자로 변환할 수 있습니다.
'''

'''
데이터 분석에 응용하기
가짜 뉴스를 뜻하는 Fake News는 트럼프 대통령이 가장 자주 사용하는 말 중 하나입니다.

FAKE NEWS, Fake News는 대소문자가 다르기 때문에 두 단어가 몇 번 사용되었는지 정확하게 확인하기 위해서는 모두 소문자로 변환해야 합니다.

trump_tweets 리스트의 문자열 요소를 모두 소문자로 변환하는 lowercase_all_characters() 함수를 완성하세요.
'''
