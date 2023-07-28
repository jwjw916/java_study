<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:set var="root" value="${pageContext.servletContext.contextPath }"></c:set>
	현재의 context path: ${root}
	<br>

	<%
	// scriptlet : _jsp serivce의 local 영역
	String name = "hong";
	%>

	<!--  expression -->
	<%=name%>


	<%!//class 영역 <%! - declaration log: member 구성 
	public String hi(String name) {
		return "hi " + name;
	}%>
	<%=hi("jang")%>

	<h1>더하기</h1>
	<form action="${root}/add" method="get">
		<input type="checkbox" name="type" value="forward" id="forward">
		<lable for="forward">forward</lable>
		<input type="text" name="num1">
		<input type="text" name="num2">
		<input type="submit" value="눌러주세요">
	</form>
	
	<c:if test="${empty loginID }">
	<h1>로그인하기 - 세션에 값이 없을 때만 필요하다</h1>
	<form action="${root}/LoginServlet" method="post">
		<input type="text" name="id">
		<input type="password" name="pass">
		<input type="submit" value="다음">
	</form></c:if>
	<c:if test = "${!empty loginID }">
	${loginID}님 반갑습니다.
	<a href="${root}/logout">로그아웃</a></c:if>


	<h1>쿠키</h1>
	<a href="${root}/CookieMaker?type=forward">forward로 쿠키 만들기</a>
	<br>
	<a href="${root}/CookieMaker?type=redirect">redirect로 쿠키 만들기</a>
	<br>


	<h1>scope확인</h1>
	<a href="${root}/FirstServlet?type=forward">forward로 스코프 확인하기</a>
	<br>
	<a href="${root}/FirstServlet?type=redirect">redirect로 스코프 확인하기</a>
	<br>


</body>
</html>