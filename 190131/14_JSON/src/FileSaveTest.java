import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.util.Date;
import java.util.Scanner;

public class FileSaveTest {
	public static void main(String[] args) throws Exception {
//		System.setOut(new PrintStream("log.txt"));
		FileOutputStream file = new FileOutputStream("log.txt",true);
		DataOutputStream dataFile = new DataOutputStream(file);
//		ObjectOutputStream oos = new ObjectOutputStream(file);
		Scanner sc = new Scanner(System.in);
		//접속한 사람(입력)의 아이디와 시간을 파일에 저장.

		while(true) {
			System.out.print("ID : ");
			String input = sc.nextLine();
			if(input == null || input.trim().length()==0)
				break;
			
//			oos.writeObject("[" + new Date() + "] " + input+"\n");
//			oos.flush();
			dataFile.writeBytes("[" + new Date() + "] " + input+"\n");
			dataFile.flush();
		}
//		oos.close();
		dataFile.close();
	}
}
