import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest_2 {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("한글1234abcd");
		
		//byte -> char
		//char -> String
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			while(true) {
				String s = br.readLine();
				if(s == null || s.trim().equals(""))
					break;
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

		
	}
}
