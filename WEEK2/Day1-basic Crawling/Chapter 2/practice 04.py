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


    for i in list_content:
        if "박항서" in i:
            print("Okay")
        else:
            print("No")


if __name__ == "__main__":
    main()

'''
언론사 기사 내용 포함여부 확인하기
이전 실습해서 수집해온 언론사 기사 내용 중,

특정 텍스트를 포함하고 있는지

검사하는 프로그램을 제작하여

포함하고 있다면 Okay, 포함하지 않고 있다면 No를 출력하는

프로그램을 제작합니다.
'''
