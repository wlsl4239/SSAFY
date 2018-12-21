# 트럼프 대통령 트윗을 공백 기준으로 분리한 리스트입니다. 수정하지 마세요.
trump_tweets = ['thank', 'you', 'to', 'president', 'moon', 'of', 'south', 'korea', 'for', 'the', 'beautiful', 'welcoming', 'ceremony', 'it', 'will', 'always', 'be', 'remembered']

def print_korea(text):
    for i in range(len(text)):
        if(text[i][0] == 'k'):
            print(text[i])
    
    
    
# 아래 주석을 해제하고 결과를 확인해보세요.  
print_korea(trump_tweets)

'''
단어의 일부분 가져오기
인덱스를 이용하면 문자열 또는 리스트의 특정 요소에 접근할 수 있습니다. 인덱스는 0부터 시작하며 -1은 맨 마지막 문자 또는 요소를 가리킵니다.

시작 인덱스와 끝 인덱스를 이용하면 특정 구간의 요소를 리스트형으로 접근할 수 있습니다. 끝 인덱스를 생략하면 시작 인덱스부터 마지막 요소까지 접근합니다.
'''

'''
데이터 분석에 응용하기
문자열로 이루어진 text 리스트에서 k로 시작하는 문자열을 하나씩 출력하는 print_korea() 함수를 완성하세요.
'''
