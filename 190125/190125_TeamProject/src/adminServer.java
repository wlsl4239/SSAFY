import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class adminServer {


	public static void main(String[] args) {
		Map<String, Person> list = new HashMap();
		ServerSocket server;
		try {
			server = new ServerSocket(8888);
			while(true) {
				Socket socket = server.accept();

				ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());

				try {
					list = (Map<String,Person>)ois.readObject();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
