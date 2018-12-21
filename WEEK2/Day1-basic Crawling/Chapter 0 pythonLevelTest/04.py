string = input()

answer = ""

for i in range(len(string)):
    if string[i] == ' ':
        answer += " "
    else:
        answer += "개굴"
        
print(answer)
'''
임의의 길이의 문자열을 입력시 그 길이만큼 "개굴"을 출력하도록 하세요.
단, 공백은 그대로 유지되어야 합니다.
'''

