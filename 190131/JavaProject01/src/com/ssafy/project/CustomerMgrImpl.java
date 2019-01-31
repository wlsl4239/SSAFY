package com.ssafy.project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class CustomerMgrImpl implements ICustomerMgr {
	private ArrayList<Customer> list;
	private DocumentBuilder p;
	private Document doc;

	public CustomerMgrImpl() throws ParserConfigurationException {
		list = new ArrayList();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		p = factory.newDocumentBuilder();

	}

	public void getCustomerFromXML(String num) throws CustomerNotFoundException {
		try {
			doc = p.parse("http://70.12.108.200:8888/down/customer_list.xml");

			NodeList customers = doc.getElementsByTagName("customer");
			boolean customerFound = false;

			for(int i=0;i<customers.getLength();i++) {
				Customer c = new Customer();
				Element customer = (Element)customers.item(i);
				c.setNum(customer.getAttribute("customerNumber").trim());
				NodeList childs = customer.getChildNodes();
				for(int j=0;j<childs.getLength();j++) {
					Node child = childs.item(j);
					if(child.getNodeType()==Node.ELEMENT_NODE) {
						if(child.getNodeName().equals("name"))
							c.setName(child.getFirstChild().getNodeValue());
						else if(child.getNodeName().equals("point"))
							c.setPoint(Integer.parseInt(child.getFirstChild().getNodeValue()));
					}
				}
				if(c.getNum().equals(num)) {
					customerFound = true;
					list.add(c);
				}
			}
			if(!customerFound)
				throw new CustomerNotFoundException("Customer "+num+" not found!");
		} catch (Exception e) {
			e.printStackTrace();
			throw new CustomerNotFoundException("Customer "+num+" not found!");
		}
	}

	
	public void saveJson() {
		ObjectOutputStream oos;
		try {
			oos = new ObjectOutputStream(new FileOutputStream("customers.json"));
			JsonArray ja = new JsonArray();

			for(int i=0;i<list.size();i++) {
				JsonObject jo = new JsonObject();
				jo.addProperty("customerNum", list.get(i).getNum());
				jo.addProperty("name", list.get(i).getName());
				jo.addProperty("point", list.get(i).getPoint());
				ja.add(jo);
			}
			oos.writeObject(ja.toString());
			oos.flush();
			oos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void sendToServer(String num) throws CustomerNotFoundException{
		Customer c = null;
		for (Customer customer : list) {
			if(customer.getNum().equals(num)) {
				c = customer;
				new Thread() {
					@Override
					public void run() {
						try {
							Socket socket = new Socket("70.12.108.220",8888);
							ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
							oos.writeObject(customer);
							oos.flush();
							oos.close();
						} catch(Exception e) {
							e.printStackTrace();
						}
					}
				}.start();
				break;
			}
		}

		if(c==null)
			throw new CustomerNotFoundException("Customer "+num+" not found!");	
	}

}
