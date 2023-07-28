<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>전달된 정보 확인(first.jsp)</h1>
	<ul>
		<li>
			<!-- request, session, application 내장객체 활용 -->
			request parameter:
			<%=request.getParameter("type")%><br>
			request attribute:
			<%=request.getAttribute("reqAttr")%><br>
			session attribute:
			<%=session.getAttribute("sesAttr")%><br>
			application attribute:
			<%=application.getAttribute("appAttr")%><br>
	</ul>
	<!--  웹에서는 /가 container root니까 context를 써줘야함 -->
	<a href="/web_day3/session/second.jsp">두번째 JSP에 확인하러 가기</a>

</body>
</html>