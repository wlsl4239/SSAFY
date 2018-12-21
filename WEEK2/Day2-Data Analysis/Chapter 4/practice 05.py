# CSV 모듈을 임포트합니다.
import csv

def get_titles(books_csv):
    '''
    CSV 파일을 읽고 제목의 리스트를 리턴합니다. 
    '''
    
    with open(books_csv) as books:
        reader = csv.reader(books, delimiter=',')
        # 함수를 완성하세요.
        get_title = lambda row: row[0]
        titles = map(get_title,reader)
        
        return list(titles)


# 작성한 코드를 테스트합니다. 주석을 해제하고 실행하세요.
books = 'books.csv'
titles = get_titles(books)
for title in titles:
     print(title)


'''
리스트에 함수 적용하기
map()은 데이터 구조의 각 원소들에 동일한 함수를 적용하여 새로운 데이터를 만드는 파이썬의 기본 함수입니다.
data라는 리스트가 주어졌을 때, 아래의 두 코드는 유사한 연산을 합니다.
List comprehension과 map()의 가장 주된 차이점은 연산을 진행하는 시점입니다.
map()의 경우 데이터를 map이라는 클래스로 저장하고, 데이터가 필요해질 때 주어진 연산을 수행합니다.

'''
