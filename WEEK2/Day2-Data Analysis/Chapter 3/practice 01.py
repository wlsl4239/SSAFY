# 텍스트 파일을 불러옵니다.
source_file = "netflix.txt"

def make_dictionary(filename):
    '''
    텍스트 파일을 읽고 {'사용자 번호': '작품 번호'}로 구성된 딕셔너리를 리턴합니다.
    
    >>> make_dictionary(source_file)
    {'1': '1012', '2': '3781', ... }
    '''
    
    user_to_titles = {}
    with open(filename) as file:
        for line in file:
            # 아래 코드를 작성하세요.
            user, title = line.replace("\n",'').split(':')      #replace 대신 strip()사용가능
            user_to_titles[user] = title
            
            
        return user_to_titles


# 아래 주석을 해제하고 결과를 확인해보세요.  
print(make_dictionary(source_file))

'''
데이터 빠르게 탐색하기
딕셔너리(dictionary)는 키와 값이 키:값 형태로 이루어진 데이터 구조입니다.

키와 값이 쌍을 이루기 때문에 키를 이용해 값을 빠르게 찾아낼 수 있습니다.

리스트의 경우 kiwi의 뜻을 찾기 위해 모든 요소를 탐색해야 합니다.
책에서 원하는 단어를 찾을 때까지 한 장씩 넘기는 비효율적인 작업으로 약 100배 이상의 시간이 소요됩니다.
'''
