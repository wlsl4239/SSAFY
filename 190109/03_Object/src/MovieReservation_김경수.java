import java.util.Scanner;

public class MovieReservation_김경수 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("종류 : ");
		String kind = sc.next();
		System.out.print("수량 : ");
		int num = sc.nextInt();
		
		int result = 0;
		
		if(kind.equals("일반")) {
			result = num * 11000;
		} else if(kind.equals("중고생")) {
			result = num * 9000;	
		} else if(kind.equals("초등")) {
			result = num * 7000;
		}


		System.out.println(kind + " " + num + "장 " + result + "원");
	}
}
