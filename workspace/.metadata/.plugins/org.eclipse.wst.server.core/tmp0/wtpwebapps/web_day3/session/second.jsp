<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전달된 정보 확인(second.jsp)</h1>
	<ul>
		<li>
			<!-- request, session, application 내장객체 활용 -->
			request parameter:
			<%=request.getParameter("type")%>
			request attribute:
			<%=request.getAttribute("reqAttr")%>
			session attribute:
			<%=session.getAttribute("sesAttr")%>
			application attribute:
			<%=application.getAttribute("appAttr")%>
	</ul>


</body>
</html>