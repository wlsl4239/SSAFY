package com.ssafy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/controller")
public class ControllerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//모든 페이지에서 요청할 때 사용되는 servlet
		//구분하는 방법 : cmd값 종류
		//==> command 패턴.
		String cmd = request.getParameter("cmd");
		String url = "loginUI.html";
		switch(cmd) {
		case "loginAction":
			url = loginAction(request);
			break;
		case "memberInsertAction":
			url = memberInsertAction(request);
			break;
		}
		//페이지 이동
		if(url.charAt(0)=='/')
			request.getRequestDispatcher(url).forward(request, response);
		else 
			response.sendRedirect(url);
	}

	private String memberInsertAction(HttpServletRequest request) {
		/* 회원가입 처리하고 이동할 페이지 지정 */
		
		return "/loginok.jsp";
	}

	private String loginAction(HttpServletRequest request) {
		/* 조건 */
		
		return "/loginok.jsp";
	}

}
