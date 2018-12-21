from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup

elice_utils = EliceUtils()


def main():
    
    
    # URL 데이터를 가져올 사이트 url 입력
    url = "http://www.kyeonggi.com/?mod=news&act=articleList&view_type=S&sc_code=1439458030"

    # URL 주소에 있는 HTML 코드를 soup에 저장합니다.
    soup = BeautifulSoup(urllib.request.urlopen(url).read(), "html.parser")


    ##### list_title과, list_content에 append()를 사용하여 원하는 정보를 하나씩 담아 출력합니다. #####

    list_title = []
    list_content = []

    for news_title in soup.find_all("div",class_="list-titles"):
        list_title.append(news_title.get_text().strip("\n").strip("\t"))

    for news_content in soup.find_all("p",class_="list-summary") :

        list_content.append(news_content.get_text().strip("\n").strip("\t"))

    print(list_title)
    print(list_content)


    


if __name__ == "__main__":
    main()

'''
HTML 태그와 Class를 이용해 리스트 출력 연습
이전 실습과 마찬가지로

언론사 사이트의 기사 제목, 내용을 찾아서

웹 페이지에서 TAG와 Class를 찾아 리스트에 저장하고 출력하는 실습을 해봅니다.
'''
