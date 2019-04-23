package com.ssafy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.ssafy.model.UserInfo;


@WebServlet("/loginAction")
public class LoginAction extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		if(id.equals("admin") && pw.equals("1234")) {
			HttpSession session = request.getSession(true);
			session.setAttribute("loginOK", new UserInfo(id,"관리자"));
//			session.setAttribute("loginOK", id);
			request.getRequestDispatcher("/memory.jsp").forward(request, response);
		}
		else {
			response.sendRedirect("login.html");
		}
		
	}
}