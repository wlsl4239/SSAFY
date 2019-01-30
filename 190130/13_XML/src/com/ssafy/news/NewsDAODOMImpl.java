package com.ssafy.news;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NewsDAODOMImpl implements INewsDAO{
	List<News> list;
	DocumentBuilder p;
	Document doc;
	
	public NewsDAODOMImpl() throws ParserConfigurationException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		p = factory.newDocumentBuilder();
	}
	@Override
	public List<News> getNewsList(String url) throws SAXException, IOException {
		List<News> list = new ArrayList();
		connectNews(url);
		
		NodeList itemList = doc.getElementsByTagName("item");
		for(int i=0;i<itemList.getLength();i++) {
			Element item = (Element)itemList.item(i);
			NodeList itemChildList = item.getChildNodes();
			News news = new News();
			for(int j=0;j<itemChildList.getLength();j++){
				Node itemChild = itemChildList.item(j);
				if(itemChild.getNodeType()==Node.ELEMENT_NODE) {
					if(itemChild.getNodeName().equals("title")) {
//						System.out.println(itemChild.getFirstChild().getNodeValue());
						news.setTitle(itemChild.getFirstChild().getNodeValue());
					}
					else if(itemChild.getNodeName().equals("link")) {
//						System.out.println(itemChild.getFirstChild().getNodeValue());
						news.setLink(itemChild.getFirstChild().getNodeValue());
					}
					else if(itemChild.getNodeName().equals("description")) {
//						System.out.println(itemChild.getFirstChild().getNodeValue());
						news.setDesc(itemChild.getFirstChild().getNodeValue());
					}
				}
			}
			list.add(news);
		}
		return list;
	}

	@Override
	public News search(int index) {
		return list.get(index);
	}
	
	public void connectNews(String url) throws SAXException, IOException {
		doc = p.parse(url);
	}
}
