package com.ssafy.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class FrontControllerServlet extends HttpServlet {       
	private Map<String, Controller> list;
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
		list = new HashMap<>();
		list.put("/login.do",new LoginUI());
		list.put("/loginAction.do",new LoginAction());
		list.put("/member.do",new MemberUI());
		list.put("/memberAction.do",new MemberAction());
	}
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//		System.out.println("Service");
//		System.out.println(request.getRequestURI());
//		System.out.println(request.getRequestURL());
//		System.out.println(request.getContextPath());
//		System.out.println(request.getServletPath());
//		System.out.println(request.getRequestURI().substring(request.getContextPath().length()));
		
		String cmd = request.getRequestURI().substring(request.getContextPath().length());
		
		list.get(cmd).execute(request,response);
	}
}
