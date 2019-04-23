<%@page import="com.ssafy.model.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% Object obj = session.getAttribute("loginOK"); 
	if(obj==null){
%>
<script>
	alert("회원 전용 페이지 입니다!");
	location.href = "login.html";
</script>
<%	
	return;
}
%>
<%UserInfo ui = (UserInfo)session.getAttribute("loginOK"); %>
<%=ui.getId() %>(<%=ui.getName()%>)님 환영합니다.
<a href="logout">logout</a>
<h1>메모리 확인</h1>
<form action="memory" method="post">
위치  <input type="radio" name="type" value="r">request
    <input type="radio" name="type" value="s">session
    <input type="radio" name="type" value="a">application
    <input type="radio" name="type" value="c">cookie<br>

메모리 이름 <input type="text" name="name"><br>
메모리 값  <input type="text" name="value"><br>
<input type="submit" value="서버 전달">
</form>


<h2>메모리</h2>
r1 : <%=request.getAttribute("r1")%><br> 
r2 : <%=request.getAttribute("r2")%><br>
s1 : <%=session.getAttribute("s1")%><br> 
s2 : <%=session.getAttribute("s2")%><br>
application mgr : <%=application.getAttribute("mgr")%><br>