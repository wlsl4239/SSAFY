import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class CustomerDAO {
	private Collection<CustomerVO> list = new ArrayList();
	private DocumentBuilder p;
	public CustomerDAO() throws ParserConfigurationException {
		DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
		p = factory.newDocumentBuilder();
	}
	public Document getCustomer() throws SAXException, IOException {
		return p.parse("http://70.12.108.200:8888/down/customer_list.xml");
	}
	
	//모든 고객 정보를 확인.
	public ArrayList<CustomerVO> getCustomers() throws SAXException, IOException{
		ArrayList<CustomerVO> list = new ArrayList();
		
		NodeList customerList = getCustomer().getElementsByTagName("customer");
		
		for(int i=0;i<customerList.getLength();i++) {
			Element customerElement = (Element)customerList.item(i);
			CustomerVO c = new CustomerVO();
			
			String cnVlaue = customerElement.getAttribute("customerNumber");
			c.setNum(cnVlaue);			
			
			NodeList customerChild = customerElement.getChildNodes();
			
			for(int j=0;j<customerChild.getLength();j++) {
				Node n = customerChild.item(j);				
				if(n.getNodeType()==Node.ELEMENT_NODE) {
					Element e = (Element)n;
					if(e.getNodeName().equals("name"))
						c.setName(e.getFirstChild().getNodeValue());
					else if(e.getNodeName().equals("point"))
						c.setPoint(Integer.parseInt(e.getFirstChild().getNodeValue()));
				}
			}
			list.add(c);
		}
		return list;
	}
	//xx포인트 이하 고객 정보 출력
	
	//특정 고객정보 확인

}
