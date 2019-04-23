<%@ page import="com.ssafy.model.UserInfo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c"%>

<c:if test="${loginOK==null}">
	<c:redirect url="login.html"></c:redirect>
</c:if>

<c:out value="${loginOK.id}"/>(<c:out value="${loginOK.name}"/>)님 환영합니다.
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
r1 : <c:out value="${r1}"/><br> 
r2 : <c:out value="${r2}"/><br>
r2 : ${r2} <br>
s1 : <c:out value="${s1}"/><br> 
s2 : <c:out value="${s2}"/><br>
application mgr : <c:out value="${mgr}"/><br>
<!-- c:out 은 보안을 위해서 사용함. -->