package com.ssafy.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ssafy.model.MemoryMgr;

@WebServlet("/memory")
public class MemoryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		
		String type = request.getParameter("type");
		if(type==null) type="r";
		
		switch(type) {
		case "r":
			requestMemory(request,response);
			break;
		case "s":
			sessionMemory(request,response);
			break;
		case "a":
			applicationMemory(request,response);
			break;			
		case "c":
			cookie(request,response);
			break;		
		}		
	}

	private void requestMemory(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		request.setAttribute(name, value);
		request.getRequestDispatcher("/memory.jsp").forward(request, response);
	}

	private void sessionMemory(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		String name = request.getParameter("name");
		String value = request.getParameter("value");
		HttpSession session = request.getSession(true);	
			//WAS 상태에 따라 session이 유지되지 않는 경우가 있다.
			// true : 있으면 있는걸 반환, 없으면 새로 만들어 반환
		session.setAttribute(name, value);
		response.sendRedirect("memory.jsp");
	}

	private void applicationMemory(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		if(getServletContext().getAttribute("mgr") == null)
			getServletContext().setAttribute("mgr", new MemoryMgr());		
	}

	private void cookie(HttpServletRequest request, HttpServletResponse response) {
		// TODO Auto-generated method stub
		// 브라우저의 정보에서 쿠키 정보를 추출할 수 있다.
		Cookie[] cookies = request.getCookies();
		for(Cookie c : cookies)
			System.out.println(c.getName() + " | " + c.getValue());

		String name = request.getParameter("name");
		String value = request.getParameter("value");
		Cookie c1 = new Cookie(name,value);
		c1.setHttpOnly(true);
		response.addCookie(c1);
	}
}
