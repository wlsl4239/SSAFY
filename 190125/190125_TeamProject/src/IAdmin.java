import java.util.Collection;
import java.util.Map;

public interface IAdmin {

	public boolean logIn(String id,String pw) throws idNotExistedException;
	public void addAdmin(String id,String pw,String name) throws idLengthException, nameLengthException, idExistedException;
	public void addCustomer(String id,String pw,String name,int point) throws idLengthException, pointLengthException, nameLengthException, idExistedException;
	public void updateCustomer(String id,String newPW,String newName,int point) throws pointLengthException, nameLengthException, idNotExistedException;
	public void removeCustomer(String id) throws idNotExistedException;
	public Collection<Person> getCustomers();
	public void send();
}
