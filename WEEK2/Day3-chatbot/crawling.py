# -*- coding: utf-8 -*-
import json
import os
import re
import urllib.request
from urllib import parse

from bs4 import BeautifulSoup
from slackclient import SlackClient
from flask import Flask, request, make_response, render_template

app = Flask(__name__)

slack_token = 'xoxb-506472500310-506887106353-2MOYUVnJLovsW9AS4N4K0JHN'
slack_client_id = '506472500310.506886207985'
slack_client_secret = '7afdbf14875d6280e39a297a435d5ec0'
slack_verification = 'ZVCNJjtfI2zfXdKUgx969gfI'
sc = SlackClient(slack_token)

# 크롤링 함수 구현하기
def _crawl_naver_keywords(text):

   location = "강남역 "   #soup.find("span",id='lbAddr').get_text().split()[-1]
   food = text
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
       keywords.append(region[i]+' / '+menu[i]+' / '+address[2*i+1]+' / '+href[i])

   print(keywords)
   # 한글 지원을 위해 앞에 unicode u를 붙혀준다.
   return u'\n'.join(keywords)



# 이벤트 핸들하는 함수
def _event_handler(event_type, slack_event):
   print(slack_event["event"])

   if event_type == "app_mention":
       channel = slack_event["event"]["channel"]
       text = slack_event["event"]["text"]

       keywords = _crawl_naver_keywords(text)
       sc.api_call(
           "chat.postMessage",
           channel=channel,
           text=keywords
       )

       return make_response("App mention message has been sent", 200,)

   # ============= Event Type Not Found! ============= #
   # If the event_type does not have a handler
   message = "You have not added an event handler for the %s" % event_type
   # Return a helpful error message
   return make_response(message, 200, {"X-Slack-No-Retry": 1})

@app.route("/listening", methods=["GET", "POST"])
def hears():
   slack_event = json.loads(request.data)

   if "challenge" in slack_event:
       return make_response(slack_event["challenge"], 200, {"content_type":
                                                            "application/json"
                                                           })

   if slack_verification != slack_event.get("token"):
       message = "Invalid Slack verification token: %s" % (slack_event["token"])
       make_response(message, 403, {"X-Slack-No-Retry": 1})

   if "event" in slack_event:
       event_type = slack_event["event"]["type"]
       return _event_handler(event_type, slack_event)

   # If our bot hears things that are not events we've subscribed to,
   # send a quirky but helpful error response
   return make_response("[NO EVENT IN SLACK REQUEST] These are not the droids\
                        you're looking for.", 404, {"X-Slack-No-Retry": 1})

@app.route("/", methods=["GET"])
def index():
   return "<h1>Server is ready.</h1>"

if __name__ == '__main__':
   app.run('0.0.0.0', port=8080)
