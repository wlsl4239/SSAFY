import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AdminImpl implements IAdmin{
	
	private Map<String,Person> list = new HashMap();
	
	@Override
	public boolean logIn(String id, String pw)
			throws idNotExistedException {
		
		if(!list.containsKey(id))
			throw new idNotExistedException(id);
		 
			if(list.get(id) instanceof Administrator) 
				if(list.get(id).getPw().equals(pw))
					return true;
	
		return false;
	}

	@Override
	public void addAdmin(String id, String pw, String name)
			throws idLengthException, nameLengthException, idExistedException {
		if(id.length()<8)
			throw new idLengthException(Integer.toString(id.length()));
		if(name.length()<2)
			throw new nameLengthException(Integer.toString(name.length()));
		if(list.containsKey(id))
			throw new idExistedException(id);
		
		list.put(id, new Administrator(id,pw,name));
		send();
		
		new Thread() {
			@Override
			public void run() {
				send();
			}
		}.start();
	}

	@Override
	public void addCustomer(String id, String pw, String name,int point)
			throws idLengthException, pointLengthException, nameLengthException, idExistedException {
		if(id.length()<8)
			throw new idLengthException(Integer.toString(id.length()));
		if(name.length()<2)
			throw new nameLengthException(Integer.toString(name.length()));
		if(point<0)
			throw new pointLengthException(Integer.toString(point));
		if(list.containsKey(id))
			throw new idExistedException(id);
		
		list.put(id, new Customer(id,pw,name,point));
		new Thread() {
			@Override
			public void run() {
				send();
			}
		}.start();
	}

	@Override
	public void updateCustomer(String id, String newPW, String newName,int point)
			throws pointLengthException, nameLengthException, idNotExistedException {
		if(newName.length()<2)
			throw new nameLengthException(Integer.toString(newName.length()));
		if(point<0)
			throw new pointLengthException(Integer.toString(point));
		if(!list.containsKey(id))
			throw new idNotExistedException(id);

		Customer temp = (Customer)list.get(id);
		temp.setName(newName);
		temp.setPoint(point);
		new Thread() {
			@Override
			public void run() {
				send();
			}
		}.start();
	}

	@Override
	public void removeCustomer(String id) throws idNotExistedException {
		if(!list.containsKey(id))
			throw new idNotExistedException(id);
		
		list.remove(id);
		new Thread() {
			@Override
			public void run() {
				send();
			}
		}.start();
	}

	@Override
	public Collection<Person> getCustomers() {
		Collection<Person> temp = new ArrayList<>();
		
		for (Person person : list.values()) {
			if(person instanceof Customer)
				temp.add(person);
		}
		return temp;
		
	}

	@Override
	public void send() {
		try {
			Socket socket = new Socket("127.0.0.1",8888);
			
			ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject(list);
			oos.flush();
			oos.close();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
