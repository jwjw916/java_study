<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>계산 결과입니다</h1>
	<%=request.getParameter("num1")%>+
	<%=request.getParameter("num2")%>=
	<%=request.getAttribute("result")%>

	<h1>더하기 이력</h1>

	<%
	Cookie[] cookies = request.getCookies();
	if (cookies != null) {
		for (Cookie c : cookies) {
			if(c.getName().startsWith("calc_")){
			out.append("<li>" + " : " + c.getValue() + "<br>");
		}
		}
	}
	%>
	<a href="/web_day3/index.jsp">다시하기</a>

</body>
</html>