from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup

elice_utils = EliceUtils()


def main():
    print("커뮤니티 댓글")

    # 댓글를 수집할 사이트 주소 입력
    url = "https://pann.nate.com/talk/344083297"

    # URL 주소에 있는 HTML 코드를 soup에 저장합니다.
    soup = BeautifulSoup(urllib.request.urlopen(url).read(), "html.parser")

    # 1. 댓글이 있는 태크 dd 찾기
    # 2. class_="usertxt class 찾기"
    # for 반복문과 get_text()를 사용해서 출력

    for i in soup.find_all("dd",class_="usertxt"):
        print(i.get_text().strip("\n"))


if __name__ == "__main__":
    main()

'''
문제 2. 커뮤니티 댓글 수집하기
커뮤니티 댓글을 수집하여 출력하는 것을 실습해봅니다.

실습에서 쓰는 웹 사이트는 https://pann.nate.com/talk/344083297 입니다.
'''
