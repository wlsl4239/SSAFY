# 트럼프 대통령 트윗을 공백 기준으로 분리한 리스트입니다. 수정하지 마세요.
trump_tweets = ['thank', 'you', 'to', 'president', 'moon', 'of', 'south', 'korea', 'for', 'the', 'beautiful', 'welcoming', 'ceremony', 'it', 'will', 'always', 'be', 'remembered']

def print_korea(text):
    '''
    문자열로 구성된 리스트에서 k로 시작하는 문자열을 출력합니다.
    '''
    
    # 아래 코드를 작성하세요.
    for i in range(len(text)):
        if text[i].startswith('k'):
            print(text[i])
    
    
    
# 아래 주석을 해제하고 결과를 확인해보세요.  
print_korea(trump_tweets)


'''
startswith() 메소드를 이용하면 단어가 특정 문자열로 시작하는지 쉽게 확인할 수 있습니다.
'''

'''
데이터 분석에 응용하기
해시태그와 멘션을 찾기 위서는 문자열이 # 또는 @로 시작하는지 확인해야 합니다.

startswith() 메소드를 사용하여 앞서 인덱싱을 이용해 작성한 print_korea() 함수를 다시 작성하세요.
'''
