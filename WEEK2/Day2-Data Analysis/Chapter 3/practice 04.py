# 정수 3과 5를 원소로 갖는 새로운 집합을 생성합니다.
my_set = set([3,5])

# 채점을 위한 코드입니다. 수정하지 마세요. 
submit1 = my_set.copy()

# 정수 7을 my_set에 추가합니다.
my_set.add(7)

# 채점을 위한 코드입니다. 수정하지 마세요. 
submit2 = my_set.copy()

# new_numbers 리스트의 원소를 my_set에 추가합니다.
new_numbers = [1, 2, 3, 4, 5]
my_set.update(new_numbers)

# 채점을 위한 코드입니다. 수정하지 마세요. 
submit3 = my_set.copy()

# my_set에서 짝수를 모두 제거합니다.
my_set = {num for num in my_set if num%2!=0}


# 채점을 위한 코드입니다. 수정하지 마세요. 
submit4 = my_set.copy()

'''
데이터의 집합 나타내기

파이썬의 set은 집합을 나타내는 데이터 구조입니다. 집합은 순서와 중복이 없는 데이터 구조로, 데이터 분석에서 중복을 무시해야 하는 경우에 사용할 수 있습니다.

예로, 수강생 명단이 주어졌을 때 set을 이용하면 학생 유형을 쉽게 구할 수 있습니다.

A 수업과 B 수업 둘 중 하나 이상을 수강하는 학생 수 구하기
A 수업과 B 수업을 모두 수강하는 학생 수 구하기
'''
