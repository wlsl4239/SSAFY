package array1;

public class Sum {
	
	static int[] fibo = new int [100];
	
	static int Sum(int N) {
		int sum = 0;
		for(int i=1;i<=N;i++)
			sum+=i;
		return sum;
	}
	
	static int Fac(int N) {
		int sum = 1;
		for(int i=1;i<=N;i++)
			sum*=i;
		return sum;
	}

	static int gcd(int a,int b) {
		while(b != 0) {
			int temp = b;
			b = a%b;
			a = temp;
		}
		return a;
	}
	
	static int SumR(int now) {
		return (now==1) ? 1 : SumR(now-1)+now;
	}
	
	static int FacR(int now) {
		return (now == 0 || now == 1) ? 1 : FacR(now-1)*now;
	}
	
	static int Fibo(int now) {
		return (now == 0 || now == 1) ? now : Fibo(now-1) + Fibo(now-2);
	}
	
	public static int gcdR(int a, int b){
		return (b == 0) ? a : gcdR(b, a%b);
	 }
	
	public static void main(String[] args) {
		System.out.println(Sum(10));
		System.out.println(SumR(10));
		System.out.println(Fac(10));
		System.out.println(FacR(10));
		System.out.println(Fibo(2));
		System.out.println(gcd(4,6));
		System.out.println(gcdR(4,6));
		
	}
}
 