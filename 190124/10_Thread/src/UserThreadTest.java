class UserThread implements Runnable{
	private int count;
	@Override
	public void run() {
		while(true) {
			if(count >= 50) break;
			print();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	private synchronized void print() {		
		System.out.println(count++ + " " + Thread.currentThread());
	}

}
public class UserThreadTest {
	public static void main(String[] args) {
		System.out.println(Thread.MAX_PRIORITY + " " + Thread.MIN_PRIORITY);
		System.out.println(Thread.currentThread());
		
		UserThread u = new UserThread();
		Thread t1 = new Thread(u);
		Thread t2 = new Thread(u);
		Thread t3 = new Thread(u);
		t1.start();
		t2.start();
		t3.start();
		

	}
}

//1. Thread 상속
//2. Runnable implement, run() 정의
//서버프로그램이나 플랫폼 프로그램에서 사용

//새로운 쓰레드 시작 -> start();