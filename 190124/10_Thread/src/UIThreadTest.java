//UI 처리부분에 주로 사용하는방법.
public class UIThreadTest {
	public static void main(String[] args) {

		//anonymous inner class (무명 이너클래스) => 이벤트 처리할때 사용
		Thread t = new Thread() {
			@Override
			public void run() {
				System.out.println(toString());
			}
		};
		t.start();
		new Thread() {
			@Override
			public void run() {
				System.out.println(toString());
			}
		}.start();
	}

}
