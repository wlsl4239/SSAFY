from elice_utils import EliceUtils
import urllib.request
from bs4 import BeautifulSoup
import re
elice_utils = EliceUtils()


def main():
    
    #여기에 함수를 구현해봅시다.
    url = "http://m.kma.go.kr/m/nation/today.jsp"
    req = urllib.request.Request(url)
    
    sourcecode = urllib.request.urlopen(url).read()
    soup = BeautifulSoup(sourcecode,"html.parser")
    
    region = []
    weather = []
    keywords = []
    
    for nationmap in soup.find_all("div",class_="nation_map"):
        for i in nationmap.find_all("dl"):
            region.append(i.get_text().replace('\n',''))
            weather.append(i.find("img")["alt"])
            
    for i in range(len(region)):
        keywords.append("오늘의 " + region[i] + " 날씨는 '" + weather[i] + "'입니다.")
        
                
        
        
    print(region)
    print(weather)
    
    print(keywords)

if __name__ == "__main__":
    main()

'''
Href 페이지 수집
이전 실습에서 진행된 1,2,3,4 — 으로 구성된 웹 사이트 형태뿐만이 아니라

단일 페이지에 여러가지 링크가 있는 경우

링크로 이동해서 콘텐츠를 크롤링하기 위해

HTML Tag 중, 연동된 Href를 수집하여 출력하는 실습을 진행합니다.
'''
