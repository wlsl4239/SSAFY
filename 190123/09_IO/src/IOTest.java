import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest {
	public static void main(String[] args) {
		System.out.println("한글1234abcd");
		
		InputStream is = System.in;
		//byte -> char
		InputStreamReader isr = new InputStreamReader(is);
		//char -> String
		BufferedReader br = new BufferedReader(isr);
		try {
//			int input = br.read();//isr.read();//is.read();
//			System.out.println(input + " + "+ (char)(input+1));
			System.out.println(br.readLine());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
