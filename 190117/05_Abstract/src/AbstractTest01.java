//1. 추상 클래스 - 현재 객체가 완벽하지 않음을 의미

//(c) 추상 메소드가 있으면 무조건 추상 클래스라고 선언해야 한다
abstract class AbstractSuperA{
	
	public void methodA() {}
	// (b)구현부가 없는 메서드는 설계할 때 abstract라는 키워드를 넣어줘야 한다.
	public abstract void methodB() ;// {}	(a)
}

class SubImplA extends AbstractSuperA{	//(d) 상속받은 자식은 추상 메소드 재정의가 필수다.

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		System.out.println("SubImplA's methodB()");
	}
	
	
}
public class AbstractTest01 {	
	public static void main(String[] args) {
		AbstractSuperA a1;
		//a1 = new AbstractSuperA();
		a1 = new SubImplA();	//(e) 다형성의 원칙으로 자식으로 생성하는것.
		
	}
	
	
}
