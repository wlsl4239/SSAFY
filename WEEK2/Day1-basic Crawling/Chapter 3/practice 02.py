from elice_utils import EliceUtils

elice_utils = EliceUtils()
import urllib.request
from bs4 import BeautifulSoup


def main():
    url = "http://www.newsis.com/eco/list/?cid=10400&scid=10404"
    req = urllib.request.Request(url)
    sourcecode = urllib.request.urlopen(url).read()
    soup = BeautifulSoup(sourcecode, "html.parser")

    for text in soup.find_all("strong",class_="title"):

        num = text.get_text().find("…")

        if (num != -1):
            print(text.get_text()[:num])
        else:
            print(text.get_text())


if __name__ == "__main__":
    main()


'''
크롤링해온 텍스트의 문자열 가공
데이터를 크롤링해서 수집하고, 문자열을 가공하여

원하는 데이터만 남겨서 출력하는 실습을 진행해봅니다.

언론사 사이트에서 제목을 크롤링해와서 “…”로 잘린 부분까지의 문장을

“…”까지의 문자 위치를 찾아, “…”뒤의 문장을 삭제하고 “…”앞 까지의 문장만 저장해봅니다.

“…”이 없는 부분까지 if-else 를 통하여 예외처리하는 법을 실습해봅니다.
'''
