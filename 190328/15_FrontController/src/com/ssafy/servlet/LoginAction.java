package com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginAction implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/login.html";
		
		if(request.getParameter("id").equals("admin") && request.getParameter("pw").equals("1234")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("loginOK", "홍길동");
			url = "/loginOK.jsp";
		}
		request.getRequestDispatcher(url).forward(request, response);
	}

}
