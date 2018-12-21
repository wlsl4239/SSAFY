from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup

elice_utils = EliceUtils()


def main():
    print("커뮤니티 게시판")

    # URL 데이터를 가져올 사이트 url 입력
    url = "https://www.clien.net/service/group/community"

    # URL 주소에 있는 HTML 코드를 soup에 저장합니다.
    soup = BeautifulSoup(urllib.request.urlopen(url).read(), "html.parser")

    ##### list_title와 list_nickname append()를 사용하여 원하는 정보를 하나씩 담아 출력합니다. #####

    list_title = []
    list_nickname = []

    for i in soup.find_all("span",class_="subject_fixed"):
        list_title.append(i.get_text().strip("\n"))

    for i in soup.find_all("span",class_="nickname"):
        list_nickname.append(i.get_text().strip("\n"))

    print(list_title)
    print(list_nickname)

    

if __name__ == "__main__":
    main()
'''
HTML 태그와 Class를 이용해 리스트 출력 연습2
이전에 2번의 실습으로 익숙해진 HTML.

TAG 찾기와, Class 찾기로 커뮤니티 사이트의 웹 구조를 확인하여 제목과 글쓴이를 크롤링해서 가져오는 실습을 진행해봅니다.
'''
 
