# 사용자가 시청한 작품의 리스트를 저장합니다. 수정하지 마세요. 
user_to_titles = {
    1: [271, 318, 491],
    2: [318, 19, 2980, 475],
    3: [475],
    4: [271, 318, 491, 2980, 19, 318, 475],
    5: [882, 91, 2980, 557, 35],
}

def get_user_to_num_titles(user_to_titles):
    '''
    사용자가 시청한 작품의 수를 리턴합니다.
    
    >>> get_user_to_num_titles({1: [271, 318, 491]})
    {1: 3}
    '''
    
    
    user_to_num_titles = {}
    # 아래 함수를 완성하세요
    
    for key,val in user_to_titles.items():
        user_to_num_titles[key] = len(val)
    
    
    return user_to_num_titles
    

# 아래 주석을 해제하고 결과를 확인해보세요.  
print(get_user_to_num_titles(user_to_titles))


'''
데이터 순회하기

for문과 items() 메소드를 이용하면 딕셔너리의 모든 키와 값을 (키, 값)의 형태로 리스트에 담을 수 있습니다.
'''

'''
데이터 분석에 이용하기
딕셔너리로 변환한 데이터의 통계를 내기 위해서는 키와 값을 모두 불러와야 합니다.
{사용자: [작품 리스트]} 형식으로 저장된 딕셔너리를 {사용자: 본 작품의 수}로 변환하는 함수를 작성하세요.
'''
