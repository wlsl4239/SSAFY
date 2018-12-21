from flask import Flask, request, make_response, jsonify
import json
from slackclient import SlackClient
app = Flask (__name__)
slack_token = "xoxb-505705416160-507592098837-CHadBhWUuCNh6ytFCfu2kpdX"
slack_client_id = 505705416160.507223005908
slack_client_secret = "a1f5f88087a4e272f78bc98c55efbd4f"
slack_verification = "THY5Fx9HEiciTv2Tc4e7d7iZ"
sc = SlackClient(slack_token)

def _event_handler(event_type, slack_event):
    print(slack_event["event"])

    if event_type == "app_mention":
        channel = slack_event["event"]["channel"]
        text = slack_event["event"]["text"]

#        keywords = _crawl_naver_keywords(text)
        keywords= "a"
        sc.api_call(
            "chat.postMessage",
            channel=channel,
            text=keywords
        )

        return make_response("App mention message has been sent", 200,)
    
@app.route('/rabbit/<rabbit_name>')
def hello_world2(rabbit_name):
    return 'Hello, {}!'.format(rabbit_name)

@app.route("/", methods=["GET"])
def home():
    return "<h1>Server is ready.</h1>"

@app.route("/get_my_ip", methods=["GET"])
def get_my_ip():
      return request.environ.get('HTTP_X_REAL_IP', request.remote_addr)
  
app.run(threaded=True, debug=True,host='0.0.0.0' , port=5000)
