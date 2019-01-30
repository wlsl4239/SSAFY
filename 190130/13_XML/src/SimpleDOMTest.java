import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.DOMError;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class SimpleDOMTest {

	private ArrayList List = new ArrayList();
	public SimpleDOMTest() throws ParserConfigurationException, SAXException, IOException {
		DocumentBuilderFactory factory =DocumentBuilderFactory.newInstance();
		DocumentBuilder p = factory.newDocumentBuilder();
		
		Document doc = p.parse("http://70.12.108.200:8888/down/customer_list.xml");
		Element rootElement = doc.getDocumentElement();		
//		System.out.println(rootElement.getNodeName());			
		NodeList customerList = doc.getElementsByTagName("customer");
		for(int i=0;i<customerList.getLength();i++) {
			Element customerElement = (Element)customerList.item(i);
			CustomerVO c = new CustomerVO();
			String cnVlaue = customerElement.getAttribute("customerNumber");
			c.setNum(cnVlaue);			
			NodeList customerChild = customerElement.getChildNodes();
//			System.out.println(customerChild.getLength());
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
			if(c.getPoint()<=100)
				List.add(c);
		}
		System.out.println(List);
	}
	public static void main(String[] args) {
		try {
			new SimpleDOMTest();
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
