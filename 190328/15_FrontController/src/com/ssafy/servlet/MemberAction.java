package com.ssafy.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MemberAction implements Controller {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "/error.html";
		//회원 가입이 온전하게 되었다면?
		
		url = "/login.html";
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
