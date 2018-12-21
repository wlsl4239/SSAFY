from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup

elice_utils = EliceUtils()


def main():
    list_pagination = []

    for i in range(0, 5):
        url = "http://sports.donga.com/Enter?p=" + str(20*i + 1) + "&c=02"
        req = urllib.request.Request(url)
        sourcecode = urllib.request.urlopen(url).read()
        soup = BeautifulSoup(sourcecode, "html.parser")

        for i in range(3, 23):
            list_pagination.append(soup.find_all("span", class_="tit")[i].get_text())

    print(list_pagination)


if __name__ == "__main__":
    main()

'''
1,2,3… 등으로 구분된 페이지 한번에 수집
실습을 진행하는 웹 사이트 주소입니다. http://sports.donga.com/Enter?p=1&c=02

여러 페이지로 구성된 웹 사이트의 게시글을 모두 한꺼번에 가져와서

필요한 정보만 리스트에 넣어서 출력해보는 실습을 진행해봅니다.

웹 url의 패턴을 찾아서 중첩 반복문을 이용해서 list에 1~5페이지까지의 뉴스 기사 제목을 한꺼번에 담아보는 실습을 진행해봅니다.
'''
