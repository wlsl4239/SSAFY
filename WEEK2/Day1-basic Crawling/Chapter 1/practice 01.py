from elice_utils import EliceUtils
import urllib.request
from urllib import parse
from bs4 import BeautifulSoup
import re
elice_utils = EliceUtils()


def main():
    location = "강남역 "#soup.find("span",id='lbAddr').get_text().split()[-1]
    food = "짜장면"

    query = location + ' ' + food

    url = 'https://www.diningcode.com/list.php?query=' + parse.quote(query)


    soup = BeautifulSoup(urllib.request.urlopen(url).read(), "html.parser")


    region = []
    menu = []
    address = []
    href = []
    loca = []
    keywords = []
    
        
    for i in soup.find_all("ul",class_="list"):
        for j in i.find_all("span",class_="btxt"):
            region.append(j.get_text())
        for j in i.find_all("span",class_="stxt"):
            menu.append(j.get_text())
        for j in i.find_all("span",class_="ctxt"):
            address.append(j.get_text())
            for k in j.find_all("i",class_="loca"):
                loca.append(k.get_text())
        for j in i.find_all("li"):
            href.append('https://www.diningcode.com' + j.find("a")["href"])
    
    for i in range(0,len(loca)):
        address[2*i+3] = address[2*i+3][len(loca[i]):]
    
    for i in range(1,len(region)):
        keywords.append(region[i]+'\n'+menu[i]+'\n'+address[2*i+1]+'\n'+href[i]+'\n')
    
    
    print(len(keywords))
if __name__ == "__main__":
    main()


'''
네이버 인기검색어의 TAG 와 Class 를 찾고

반복문을 통해 리스트에 저장하고, 리스트를 출력해봅니다.

반복문for 과 class_=“ ” 를 이용하여

네이버 인기 검색어를 저장항 리스트(list = [])에 담아 출력해봅니다.
'''

