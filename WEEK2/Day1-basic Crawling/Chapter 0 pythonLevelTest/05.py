def crossBridge(steps):
    cnt = 0
    current = 0
    n = len(steps)
    while (current<n):
        current += steps[current]
        cnt += 1
    return cnt
    
    
print(crossBridge([1, 1, 2, 3, 5]))

'''
구름다리의 발판에 적혀있는 숫자가 첫 번째부터 순서대로 들어있는
배열 steps가 매개변수로 주어질 때,
토끼가 구름다리를 모두 건너기 위해 필요한 점프 횟수를 반환하도록
crossBridge 함수를 작성하고자 합니다.
'''
