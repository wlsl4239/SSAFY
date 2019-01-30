package com.ssafy.news;

import java.io.IOException;
import java.util.List;

import org.xml.sax.SAXException;

public interface INewsDAO {
	List<News> getNewsList(String url) throws SAXException, IOException;
	News search(int index);

}
