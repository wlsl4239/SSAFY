# 트럼프 대통령 트윗을 공백 기준으로 분리한 리스트입니다. 수정하지 마세요.
trump_tweets = ['america', 'is', 'back', 'and', 'we', 'are', 'coming', 'back', 'bigger', 'and', 'better', 'and', 'stronger', 'than', 'ever', 'before']

def make_new_list(text):
    '''
    문자열로 구성된 리스트에서 b로 시작하는 모든 문자열을 새로운 리스트에 담습니다.
    '''
    
    # 아래 코드를 작성하세요.
    
    new_list=[]
    for i in range(len(text)):
        if(text[i].startswith('b')):
            new_list.append(text[i])
    
    
    return new_list


# 아래 주석을 해제하고 결과를 확인해보세요.  
new_list = make_new_list(trump_tweets)
print(new_list)

'''
새로운 단어 추가하기
append()는 리스트를 다룰 때 사용되는 가장 기본적인 메소드로, 리스트의 맨 마지막에 새로운 요소를 추가합니다.
'''

'''
데이터 분석에 응용하기
append()를 이용하면 빈 리스트에 데이터를 쉽게 추가할 수 있습니다.

trump_tweets 리스트에서 b로 시작하는 요소를 빈 리스트 new_list에 저장하는 make_new_list() 함수를 수정하세요.
'''
