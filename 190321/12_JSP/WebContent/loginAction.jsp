<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <%
 	//1. 입력
 	String id = request.getParameter("id");
 	String pw = request.getParameter("pw");
 	
 	//2. 로그인 여부 확인(id=admin, pw=1234)  //3. 결과값 처리
 	
 	if(id.equals("admin") && pw.equals("1234")){
 		%>
 		
 		<h1> <%=id %>님 환영합니다 </h1>
 		
 <%	} else{ 
	response.sendRedirect("error.html");
 } %>