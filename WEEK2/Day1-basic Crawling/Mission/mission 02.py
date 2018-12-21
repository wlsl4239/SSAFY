from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup

elice_utils = EliceUtils()


def main():

    comments = []

    # 댓글을 가져와야 하는 URL 3개를 반복문을 이용해서 한꺼번에 가져오기
    # url = "https://himchanyoon1992.tistory.com/2"
    # url = "https://himchanyoon1992.tistory.com/3"
    # url = "https://himchanyoon1992.tistory.com/4"

    # 반복문의 i와 url을 합쳐주는 과정은 str()을 사용하시면 됩니다.

    for i in range(3):
        url = "https://himchanyoon1992.tistory.com/"+str(i+2)
        soup = BeautifulSoup(urllib.request.urlopen(url).read(), "html.parser")

        for comment in soup.find_all("span",class_="txt_reply"):
            comments.append(comment.get_text())

    print(comments)

    # 결과물
    # ['1번 페이지 댓글 1', '1번 페이지 댓글 2', '1번 페이지 댓글 3', '2번 페이지 댓글 1', '2번 페이지 댓글 2', '2번 페이지 댓글 3', '3번 페이지 댓글 1', '3번 페이지 댓글 2', '3번 페이지 댓글 3']


if __name__ == "__main__":
    main()

'''
여러 페이지 댓글 수집 
티스토리 3개 페이지의 댓글을 한꺼번에 수집해봅시다.

url은 각각

https://himchanyoon1992.tistory.com/2
https://himchanyoon1992.tistory.com/3
https://himchanyoon1992.tistory.com/4
입니다.

출력값을 잘 확인하고 제출해보세요.
'''
