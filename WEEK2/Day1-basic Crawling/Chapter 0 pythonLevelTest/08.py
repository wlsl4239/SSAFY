a = input()

a = int(a)

str1 = "*"
str2 = ""


for j in range(2):
    for i in range(a):
        str1 += ' '
    str1 += '*'
    

if a%2 == 0:
    for i in range(int(a/2)+1):
        str2 += " "
    str2 += "*"
    for i in range(int(a-1)):
        str2 += " "
    str2 += "*"
    
else:
    for i in range(int((a+1)/2)):
        str2 += " "
    str2 += "*"
    for i in range(int(a)):
        str2 += " "
    str2 += "*"

    
print(str1)
print(str2)


'''
별의 거리 i가 입력으로 주어질 때, 별 사이의 거리가 i인 W모양의 대칭인 별자리를 출력하세요.
단, 별의 거리 i가 짝수이면 2행의 두 별 사이의 거리는 i-1입니다.
'''
