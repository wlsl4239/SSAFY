class Rectangle:
    def __init__(self,_w,_h) :
        self.width = _w
        self.height = _h
    def area(self):
        return self.width*self.height
    
class Square(Rectangle):
    def __init__(self,_s):
        self.side = _s
        
    def area(self):
        return self.side * self.side


alice = Rectangle(10, 20)
print(alice.area())

bob = Square(10)
print(bob.area())


'''
Rectangle 클래스를 정의합니다.
생성자의 매개변수가 2개이며 이것이 Rectangle 클래스의 멤버 width, height가 됩니다.
면적을 구하는 메서드 area()를 정의합니다. 멤버 width와 height를 곱한 값을 반환합니다.
Square 클래스를 정의합니다.
Rectangle 클래스를 상속받습니다.
생성자의 매개변수가 1개이며 이것이 Square 클래스의 멤버 side가 됩니다.
면적을 구하는 메서드 area()를 오버라이딩합니다. side를 제곱한 값을 반환합니다.
'''
