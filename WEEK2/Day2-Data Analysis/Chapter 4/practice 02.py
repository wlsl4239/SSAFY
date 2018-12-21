# CSV, JSON 모듈을 임포트합니다.
import csv
import json
from elice_utils import EliceUtils

elice_utils = EliceUtils()

def books_to_json(src_file, dst_file):
    '''
    CSV 데이터를 JSON 형태로 변환합니다.
    '''
    
    # 아래 함수를 완성하세요.
    books = []
    with open(src_file) as src:
        reader = csv.reader(src,delimiter=',')
        
        # 각 줄 별로 대응되는 book 딕셔너리를 만듭니다.
        for row in reader:
            # 책 정보를 저장하는 딕셔너리를 생성합니다.
            book = {
                "title": row[0],
                "author": row[1],
                "genre": row[2],
                "pages": int(row[3]),
                "publisher": row[4]
            }
            books.append(book)
    
    with open(dst_file, 'w') as dst:
        # JSON 형식으로 dst_file에 저장합니다.
        dst.write(json.dumps(books))
        pass


# 아래 주석을 해제하고 결과를 확인해보세요.  
src_file = 'books.csv'
dst_file = 'books.json'
books_to_json(src_file, dst_file)
elice_utils.send_file(dst_file)

'''
CSV 데이터 변환하기

CSV 데이터의 각 열은 고유한 의미를 갖습니다.
책 데이터를 CSV 형식으로 저장한다면 각 열은 제목, 작가, 페이지 수 등의 의미를 갖게 됩니다.

이 성질을 이용하면 CSV 데이터를 JSON으로 변환할 수 있습니다.
이 실습에서는 책 데이터를 담은 CSV 파일을 동일한 의미를 가진 JSON 형식으로 변환해 봅니다.
'''
