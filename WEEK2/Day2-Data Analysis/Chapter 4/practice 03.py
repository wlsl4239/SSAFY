# num을 제곱한 값을 리턴합니다.
def _square(num):
    return num * num

# _square()와 동일한 기능을 하는 lambda 함수 square를 만들어 보세요.
square = lambda x:x*x


# string이 빈 문자열일 경우 빈 문자열을, 아니면 첫 번째 글자를 리턴합니다.
def _first_letter(string):
    return string[0] if string else ''

first_letter = lambda s: s[0] if s else ''


# assert를 이용하여 두 함수의 기능이 동일한 지 테스트합니다. 아래 주석을 해제하고 결과 값을 확인해보세요.
testcases1 = [3, 10, 7, 1, -5]
for num in testcases1:
    assert(_square(num) == square(num))

testcases2 = ['', 'hello', 'elice', 'abracadabra', '  abcd  ']
for string in testcases2:
    assert(_first_letter(string) == first_letter(string))

# 위의 assert 테스트를 모두 통과해야만 아래의 print문이 실행됩니다.
print("성공했습니다!")


'''
한 줄 함수 작성하기
lambda는 def와 비슷하게 함수를 생성하는 연산입니다. 단, 함수가 이름을 갖지 않고, 특정 범위에서만 적용되기 때문에 한 번만 사용되거나 아주 간단한 함수를 선언할 때 사용됩니다. 그 외의 경우 def를 이용합니다.

아래 코드는 동일한 기능을 갖고 있습니다
'''
