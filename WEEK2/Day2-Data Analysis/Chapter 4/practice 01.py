# csv 모듈을 임포트합니다. 
import csv

def print_book_info(filename):
    '''
    CSV에서 제목, 저자, 페이지를 추출합니다.
    '''
    
    # 아래 주석을 해제하고 실행 결과를 확인해보세요.
    with open(filename) as file:
        # ',' 기호로 분리된 CSV 파일을 처리하세요..
        reader = csv.reader(file,delimiter=',')
        
        # 처리된 파일의 각 줄을 불러옵니다.
        for row in reader:
            # 함수를 완성하세요.
            title = row[0]
            author = row[1]
            pages = row[3]
            print("{} ({}): {}p".format(title, author, pages))


# 아래 주석을 해제하고 실행 결과를 확인해보세요.
filename = 'books.csv'
print_book_info(filename)

'''
CSV 데이터 읽고 처리하기
CSV는 콤마로 나뉘어진 데이터 형식으로, 용량이 작고 엑셀 등의 프로그램으로 보기 좋게 표현할 수 있다는 장점이 있습니다.
파이썬의 내장 csv 라이브러리를 이용하면 CSV 파일을 효율적으로 읽어 올 수 있습니다.

reader()는 CSV 파일의 내용을 먼저 줄 별로 나눈 뒤, 구분 기호(delimiter)를 기준으로 분리해 주는 함수입니다.
'''
