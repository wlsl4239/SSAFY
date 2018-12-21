# CSV 모듈을 임포트합니다.
import csv

def get_titles_of_long_books(books_csv):
    '''
    페이지 수가 250이 넘는 책들의 제목을 리스트로 리턴합니다.
    '''
    
    with open(books_csv) as books:
        reader = csv.reader(books, delimiter=',')
        # 함수를 완성하세요.
        is_long = lambda row: int(row[3]) > 250
        get_title = lambda row: row[0]
        
        long_books = filter(is_long, reader)
        long_book_titles = map(get_title, long_books)
        
        return list(long_book_titles)


# 작성한 함수를 테스트합니다. 주석을 해제하고 실행하세요.
books  = 'books.csv'
titles = get_titles_of_long_books(books)
for title in titles:
    print(title)


'''
리스트에 함수 적용하기
filter()는 주어진 데이터 구조에서 특정 조건을 만족하는 원소만 골라 내는 파이썬의 기본 함수입니다.
data라는 리스트가 주어졌을 때, 아래의 두 코드는 유사한 연산을 합니다.


filter()도 map()과 마찬가지로 즉시 연산되지 않고 filter 타입의 데이터 구조를 생성합니다.
'''
