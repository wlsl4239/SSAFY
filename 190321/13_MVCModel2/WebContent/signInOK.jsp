<%@page import="com.ssafy.model.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	//if(request.getAttribute("info") != null)
	MemberVo vo = (MemberVo)request.getAttribute("info");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
span{width:100px; display: inline-block;}
</style>
<title>Insert title here</title>
</head>
<body>
<h1>Sign Info</h1>
    <span>ID</span><%=vo.getId() %><br>
    <span>이름</span><%=vo.getName() %><br>
    <span>성별</span><%=vo.getGender() %><br>
    <span>생년월일</span><%=vo.getBirthday() %><br>

</body>
</html>