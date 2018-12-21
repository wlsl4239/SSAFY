from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup

elice_utils = EliceUtils()


def main():
    # URL 데이터를 가져올 사이트 url 입력
    url = "https://himchanyoon1992.tistory.com/1"

    # URL 에 있는 HTML 코드를 soup에 저장합니다.
    soup = BeautifulSoup(urllib.request.urlopen(url).read(), "html.parser")

    comments = []

    # 댓글 부분을 찾아서 list에 하나씩 댓글을 삽입합니다.
    for comment in soup.find_all("span",class_="txt_reply"):
        comments.append(comment.get_text())

    # list를 출력합니다.
    print(comments)




if __name__ == "__main__":
    main()

'''
블로그 댓글 수집
배운 내용을 활용해 URL이 https://himchanyoon1992.tistory.com/1 인 블로그 사이트의 댓글을 수집해봅시다.

댓글 부분을 올바르게 찾아서 comments 리스트에 담아 출력해보세요.

출력값이 올바른지 확인한 다음, 제출 버튼을 눌러 채점을 받아 봅시다.
'''
