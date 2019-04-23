<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%  String [] list = {"aaa", "bbb", "ccc"};
	request.setAttribute("list", list);
%>


${list}

<ul>
	<li>목록</li>
	<c:forEach items="${list}" var="tmp">
		<li> <c:out value="${tmp }"/> </li>
	</c:forEach>
	
</ul>