from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup
import re

elice_utils = EliceUtils()


def main():

    url = "https://himchanyoon1992.tistory.com/5"
    soup = BeautifulSoup(urllib.request.urlopen(url).read(), "html.parser")

    # 크롤링해서 글 내용을 text에 담기
    text = soup.find("div",class_="tt_article_useless_p_margin").get_text()

    # 숫자만 찾는 정규식 코드
    compile_text = re.compile("[0-9]+")
    match_text = compile_text.findall(text)

    # 숫자만 출력
    print(match_text)



if __name__ == "__main__":
    main()

'''
정규표현식 사용해보기
웹 사이트의 글 내용중, 정규표현식을 이용해 숫자만 찾아 리스트에 넣고, 출력해봅시다.

https://himchanyoon1992.tistory.com/5

출력값을 확인하고, 제출버튼을 눌러보세요.
'''
