# 트럼프 대통령의 트윗 세개로 구성된 리스트입니다. 수정하지 마세요.
trump_tweets = [
    "i hope everyone is having a great christmas, then tomorrow it’s back to work in order to make america great again.",
    "7 of 10 americans prefer 'merry christmas' over 'happy holidays'.",
    "merry christmas!!!",
]

def remove_special_characters(text):
    '''
    리스트에 저장된 문자열에서 쉼표, 작은따옴표, 느낌표를 제거합니다.
    
    >>> remove_special_characters(["wow!", "wall,", "liberals'"])
    ['wow', 'wall', 'liberals']
    '''
    
    processed_text = []
    # 아래 코드를 작성하세요.
    for i in range(len(text)):
        processed_text.append(text[i].replace('!','').replace(',','').replace('\'',''))
    
    
    
    return processed_text


# 아래 주석을 해제하고 결과를 확인해보세요.  
print('\n'.join(remove_special_characters(trump_tweets)))


'''
특수기호 삭제하기
replace() 메소드는 문자열에서 특정 문자나 문자열을 다른 문자(열)로 변경할 때 사용됩니다.

replace()는 변경하고 싶은 문자열을 첫번째 입력값으로, 대체할 문자열을 두번째 입력값으로 받습니다.
'''

'''
데이터 분석에 응용하기
소문자로 변환된 trump_tweets의 트윗을 공백을 기준으로 구분할 경우 christmas', christmas,, christmas!!!가 생성되기 때문에 christmas가 몇 번 사용되었는지 정확하게 확인하기 위해서는 특수문자를 제거해야 합니다.

trump_tweets 리스트의 문자열 요소에서 쉼표, 작은따옴표, 느낌표를 제거하는 remove_special_characters() 함수를 완성하세요.
'''
