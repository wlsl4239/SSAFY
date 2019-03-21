package com.ssafy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginAction2")
public class LoginAction2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. 사용자의 요청을 받는다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id + " " + pw);
		//2. 요청 데이터를 자바빈으로 전달해서 처리한다.
	
		if(id.equals("admin") && pw.equals("1234")) {
			//서버 내에서 페이지 이동 후 전달
			request.getRequestDispatcher("/loginok.jsp").forward(request, response);	//서버 내에서 이동하는건 앞에 /가 있어야 한다.
														//
		} else {
			//location.href			
			response.sendRedirect("error.html");		//메모리를 공유하지 않음. (request가 2번이기 때문)
		}

	}
}
