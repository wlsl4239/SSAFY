package com.ssafy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.Session;

import com.ssafy.model.MemberVo;

@WebServlet("/MVCservlet")
public class MVCservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String cmd = request.getParameter("cmd");
		String url = "/login.html";
		switch(cmd) {
		case "signinOK":
			url = signinAction(request);
			break;
		case "login":
			url = loginAction(request);
			break;
		}
		
		if(url.charAt(0) == '/')
			request.getRequestDispatcher(url).forward(request, response);
		else
			response.sendRedirect(url);
	}

	private String loginAction(HttpServletRequest request) {

		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		if(request.getParameter("id").equals("admin") && request.getParameter("pw").equals("1234")) {

			MemberVo vo = new MemberVo(id,"","","");
			request.setAttribute("login", vo);
			return "/loginOK.jsp";
		}
		else
			return "/signIn.html";
	}

	private String signinAction(HttpServletRequest request) {
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String birthday = request.getParameter("birthday");
		
		MemberVo vo = new MemberVo(id,name,gender,birthday);
		
		request.setAttribute("info", vo);
		
		return "/signInOK.jsp";
	}
	
}
