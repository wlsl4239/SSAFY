import java.util.ArrayList;
import java.util.Collection;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class userHandling extends DefaultHandler {

	private Collection<CustomerVO> list = new ArrayList();
	private CustomerVO vo;
	//	private boolean name;
	//	private boolean point;
	private String elementFlag = "";

	@Override
	public void startDocument() throws SAXException {
		System.out.println("XML 해석 시작");
	}

	@Override
	public void endDocument() throws SAXException {
		for (CustomerVO customer : list) {
			System.out.println(customer);
		}
		System.out.println("해석 완료");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if(qName.equals("customer")) {
			vo = new CustomerVO();
			vo.setNum(attributes.getValue("customerNumber"));
		}
		else if(qName.equals("name"))
			elementFlag = "name";
		else if(qName.equals("point"))
			elementFlag = "point";
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {	//textNode
		String tmp = new String(ch, start, length).trim();

		switch(elementFlag) {
		case "name":
			vo.setName(tmp);
			break;
		case "point":
			vo.setPoint(Integer.parseInt(tmp));
			break;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("customer")) {
			if(vo.getPoint()>=100)
				list.add(vo);
			vo = null;
		}
		elementFlag = "";
	}
}
