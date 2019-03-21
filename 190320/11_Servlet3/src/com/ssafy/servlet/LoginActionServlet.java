package com.ssafy.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginAction")
public class LoginActionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		//1. 사용자의 요청을 받는다.
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		System.out.println(id + " " + pw);
		//2. 요청 데이터를 자바빈으로 전달해서 처리한다.
	
		
		
		
		//3. 결과를 브라우저에 전달한다.
		PrintWriter out = response.getWriter();
		out.println(id+"님 환영합니다.");
		out.println("<h1>servlet page</h1>");
		out.flush();
		out.close();
	}
}

/*
서버에서 실행 결과를 전달하는 방법

1. servlet을 통해 response.getWriter()
	-> page 디자인 하기가 힘들다.
2. 브라우저에 주소를 전달해서 새로운 요청을 유도함.
	ex) location.href
	-> 통신을 두번 한다.
3. 서버 내에서 page를 이동
	-> 주소를 노출하지 않을 수 있다.

*/