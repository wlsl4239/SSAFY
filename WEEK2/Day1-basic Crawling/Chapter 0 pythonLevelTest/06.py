def isPrince(frogList):
    for elem in frogList:
        if elem[0] == "F":
            return elem
        
        

print(isPrince(['Alice', 'Bob', 'Frog']))

'''
frogList에 담긴 문자열 중 'F’로 시작하는 값을 return 하는 isPrince 함수를 동작하도록 수정하기.
(단, frogList에는 반드시 F으로 시작하는 이름이 하나 들어있습니다.)
'''
 
