//1.2 추상메소드가 없지만 추상클래스인 경우.
//재정의를 확정하기 어려울 때는 일단 상속만 유도.
//UI Event 처리할 때 등 사용.

abstract class AbstractSuperB {
	public void methodA() {}
	public void methodB() {}
	
	
}
class SubImplB extends AbstractSuperB {
	
}

public class AbstractTest02 {
	public static void main(String[] args) {
		AbstractSuperB ab;
//		ab = new AbstractSuperB();
		ab = new SubImplB();
	}

}
