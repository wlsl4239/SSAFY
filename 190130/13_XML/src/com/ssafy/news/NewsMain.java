package com.ssafy.news;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

public class NewsMain {
	JFrame f;
	JButton b;
	JList li;
	JTextArea ta;
	INewsDAO dao;
	
	public NewsMain() throws ParserConfigurationException {
		dao = new NewsDAODOMImpl();
		createGUI();
		addEvent();
//		showList();
	}

	private void createGUI() {
		f = new JFrame("NewsList");
		JPanel p = new JPanel();
		b = new JButton("News List 호출");
		li = new JList<>();
		ta = new JTextArea();
		ta.setLineWrap(true);
		p.setLayout(new BorderLayout());
		p.add(b,"North");
		p.add(li);
		f.setLayout(new GridLayout(2, 1, 5, 5));
		f.add(p);
		f.add(ta);
		f.setSize(400, 500);
		f.setVisible(true);
	}

	private void addEvent() {
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) { System.exit(0); }
		});
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				showList();
			}
		});
		li.addListSelectionListener(new ListSelectionListener() {			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				// TODO Auto-generated method stub
				News n = (News)li.getSelectedValue();
				ta.setText(n.getDesc());
			}
		});
	}
	private void showList() {
		try {
			List<News> datas = dao.getNewsList("http://rss.etnews.com/Section902.xml");
			li.removeAll();
			li.setListData(datas.toArray());
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void main(String[] args) throws ParserConfigurationException {
		new NewsMain();
	}
}
