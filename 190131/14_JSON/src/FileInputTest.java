import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputTest {
	public static void main(String[] args) throws Exception {
		DataInputStream dis = new DataInputStream(new FileInputStream("log.txt"));

		while(true) {
			String s = dis.readLine();
			if(s==null || s.trim().length()==0)
				break;
			System.out.println(s);
			String[] tmp = s.split(", ");
			
			System.out.println(tmp[0]+" : "+tmp[1]);
		}
	}
}
