//1.3 모든 멤버가 추상 메소드인 경우
//interface라는 문법을 권장.
abstract class AbstractSuperC {
	public abstract void methodA();
	public abstract int methodB();
}

//데이터는 상수만, 업무의 IO 표준만 정의한다.
interface SuperInterface{
	String NAME = "홍길동";	//data 앞에 public static final가 붙음. => 무조건 상수.
	void methodA();		//interface는 method 앞에 public abstract가 붙음.
	int methodB();				
}
class SubImplC implements SuperInterface {

	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int methodB() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}

public class AbstractTest03 {
	public static void main(String[] args) {
		
	}

}
