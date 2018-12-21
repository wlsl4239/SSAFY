a,b = input().split()

a = int(a)
b = int(b)


def gcd(x,y):
    while(y):
        x,y = y, x%y
    return x
    
print(int(a*b/gcd(a,b)))

'''
토끼의 휴식시간 N과 거북이의 휴식시간 M이 매게 변수로 주어졌을때, 토끼와 거북이가 동시에 휴식하는 최초의 시간을 출력하는 프로그램을 작성해봅시다.
'''
 
