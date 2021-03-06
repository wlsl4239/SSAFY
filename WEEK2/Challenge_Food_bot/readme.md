### 기본 정보: 
elice-ssafy-seoul-9.slack.com

---

### food_bot
명령어를 입력시 맞춤형 음식 메뉴 추천을 해주는 챗봇입니다.

---

### 팀원별 역할
- 심재훈 : 추천시스템의 알고리즘을 개발하고 챗봇과 연동.
- 김경수 : 웹에서 정보를 크롤링 및 데이터 파싱, UX 디자인 담당.

---
### 기획 배경:
- 기존 사례
맛집을 검색해보면 나오는 mangoplate, tripadvisor의 사이트는 여러 맛집을
제시해줍니다.
- 용도
무엇을 먹을지 고민되는 그 순간! 챗봇에 명령어를 입력해주면 그 고민을 해결해
드립니다.
- 기능
음식 메뉴 한가지를 추천해주고, 주변 맛집 3곳을 웹에서 검색해 출력해줍니다.
- 차별점
인간은 인지적 구두쇠입니다. 귀차니즘이라는 유행어까지 생길정도로 평소에 어떠한
결정도 내리기 싫어하는데 이를 챗봇 추천을 통해 해결하고자 했습니다.

---

### 구현 목표: 
기술적 완성도, 세부 기능
- 기술적 완성도 및 세부기능
* NLP library를 이용해서 음식 추천과 관련된 키워드 입력시 반응한다.
* 내부 추천 시스템을 통해 개인 맞춤형 음식 추천을 해준다.
+ 처음 추천 10번동안은 자료 조사를 위해 랜덤으로 음식을 추천해준다.
+ 이후 추천은 content-based-filtering 방식으로 음식의 weight를 계산해 weighted
sampling으로 음식 하나를 추천해준다. 음식의 content는 음식의 분류, 맛으로
한다.(중식, 한식,...,단맛, 짠맛, 느끼한맛…)
+ 추후에 유저 로그가 쌓일시 Collaborative-filtering 방식으로 추천 알고리즘을
전환한다. (elice-netflix실습과 같은 방식)
추천된 음식과 관련된 주변 맛집을 웹에서 검색하고 원하는 format으로
이를 정리해 출력한다.
+ 이를 slack에서 보기 쉽게 가공해 출력한다.
* 결과가 마음에 들면 종료하고, 마음에 들지 않으면 다시 추천 과정을
반복한다. 응답값 log를 DB에 저장한다.



### 추가사항
- python -m pip install plotly
- python -m pip install slackclient
