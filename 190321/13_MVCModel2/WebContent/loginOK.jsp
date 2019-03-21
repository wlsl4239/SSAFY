<%@page import="com.ssafy.model.MemberVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%MemberVo vo = (MemberVo)request.getAttribute("login"); %>
    <h1><%=vo.getId() %>님 환영합니다!</h1> 