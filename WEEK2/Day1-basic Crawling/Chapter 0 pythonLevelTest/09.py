class maxMachine :
    def __init__(self) :
        self.numbers = []

    def addNumber(self, n) :
        self.numbers.append(n)
        pass

    def removeNumber(self, n) :
        self.numbers.remove(n)
        pass

    def getMax(self) :
        self.numbers.sort()
        return self.numbers[-1]
        pass

def main():

    myMachine = maxMachine()

    '''
    테스트를 하고싶으면, 아래 부분을 수정합니다.
    '''

    myMachine.addNumber(1)
    myMachine.addNumber(2)
    myMachine.addNumber(3)
    myMachine.addNumber(2)

    print(myMachine.getMax())

    myMachine.removeNumber(3)

    print(myMachine.getMax())

    myMachine.removeNumber(2)

    print(myMachine.getMax())

if __name__ == "__main__":
    main()

'''
엘리스의 이상한 기계상자는 다음의 기능을 지원 해야합니다.

machine.addNumber(x) : 숫자 x를 최댓값 기계 machine에 추가합니다.

machine.removeNumber(x) : 숫자 x를 최댓값 기계 machine으로부터 제거합니다. 만약 숫자 x가 최댓값 기계 내에 없다면 아무 일도 일어나지 않습니다.

machine.getMax() : 최댓값 기계 machine이 갖고있는 숫자들 중 최댓값을 반환합니다.
'''
 
