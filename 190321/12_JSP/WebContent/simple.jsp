<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 스크립팅 요소 -->

<h1>JSP에서 자바 소스 삽입</h1>

	<%! 
		// 선언(Declaration)
		// jsp --> servlet
		// !가 있으면 servlet의 멤버데이터, 멤버메소드를 정의할 수 있다.
		private int count;
		public String toString(){
			return "count : " + ++count;
		}
	%>
	
	<%	
		// 스크립트릿(Scriptlet)
		// servlet _jspService() 내의 구현부를 정의.
		// _jspService()내에는 미리 정해놓은 객체명이 있다. (내장 객체)
		String id = request.getParameter("id");
		out.print("<h1>"+id+"</h1>");
	%>
	
	html 중심으로 jsp 값을 살짝 출력<br>	
	<h3> <%=id %> </h3>		<!-- 표현식(Expression) -->