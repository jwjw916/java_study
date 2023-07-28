<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>쿠키확인</h1>
			<%=request.getParameter("type")%>
			<%
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
			for (Cookie cookie : cookies) {
			out.println("쿠키 명 : " + cookie.getName() + "<br>");
			out.append("값 : " + URLDecoder.decode(cookie.getValue(), "utf-8") + "<br>");
			}
			}
				%>
			
</body>
</html>