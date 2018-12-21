from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup

elice_utils = EliceUtils()


def main():
    list_href = []
    list_content = []

    url = "https://news.sbs.co.kr/news/newsflash.do?plink=GNB&cooper=SBSNEWS"
    req = urllib.request.Request(url)
    sourcecode = urllib.request.urlopen(url).read()
    soup = BeautifulSoup(sourcecode, "html.parser")

    for href in soup.find_all("div",class_="mfn_inner"):
        list_href.append("https://news.sbs.co.kr/" + href.find("a")["href"])

    for i in range(0, len(list_href)):
        url = list_href[i]
        req = urllib.request.Request(url)
        sourcecode = urllib.request.urlopen(url).read()
        soup = BeautifulSoup(sourcecode, "html.parser")
        
        list_content.append(soup.find("div",class_="text_area").get_text())

    print(list_href)
    print(list_content)


if __name__ == "__main__":
    main()

    '''
크롤링해서 수집해온 링크 주소에 있는 내용 크롤링
수집하는 페이지에 연동되어 있는 href를 추출하여

언론 기사 리스트 뿐 아니라, 전체 내용까지 수집하는법을 실습해봅니다.

첫번째로 href 링크를 모두 수집해서

len()함수를 이용하여 href를 수집한 리스트의 크기만큼 반복문을 실행해서

href로 연결된 페이지 모두 크롤링해오는 실습을 진행합니다.
'''
