# 트럼프 대통령의 1월 1~3일 트윗을 각각 리스트의 원소로 저장합니다.
trump_tweets = [
    'Will be leaving Florida for Washington (D.C.) today at 4:00 P.M. Much work to be done, but it will be a great New Year!',
    'Companies are giving big bonuses to their workers because of the Tax Cut Bill. Really great!',
    'MAKE AMERICA GREAT AGAIN!'
]

def date_tweet(tweet):
    '''
    트럼프 대통령의 트윗을 트윗 일자와 함께 출력합니다.
    '''
    
    # index에 0~2을 차례대로 저장하여 반복문을 실행합니다.
    for index in range(len(tweet)):
        print('2018년 1월 ' + str(index+1) + '일: ' + tweet[index])


# 실행 결과를 확인하기 위한 코드입니다.
date_tweet(trump_tweets)

'''
문장의 단어를 하나씩 가져오기
for 반복문에 in 키워드를 이용하면 리스트의 원소를 하나씩 가져와 변수에 저장할 수 있습니다.

여기에 리스트의 길이를 구하는 len()와, 연속된 정수를 만들어주는 range() 함수를 함께 사용하면 원소의 인덱스를 가져올 수 있습니다.
'''

'''
데이터 분석에 응용하기
lower(), replace() 등 다양한 메소드를 이용해 트럼프 대통령의 트윗을 정제하기 위해선 먼저 리스트에 담긴 요소를 하나씩 가져와야 합니다.

trump_tweet 리스트의 문자열 요소를 하나씩 가져와서 트윗 게시일과 함께 출력하는 date_tweet 함수를 살펴보고, 실행·제출해보세요.
'''
