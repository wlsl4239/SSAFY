import javax.xml.parsers.ParserConfigurationException;

public class DAOTest {
	public static void main(String[] args) {
		try {
			CustomerDAO dao = new CustomerDAO();
			System.out.println(dao.getCustomers());
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}
