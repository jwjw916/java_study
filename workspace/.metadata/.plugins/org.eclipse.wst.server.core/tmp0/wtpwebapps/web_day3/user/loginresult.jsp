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

	<h1>로그인 결과입니다</h1>
	${loginID}님 로그인 성공입니다.
	<a href="${root}/index.jsp">처음으로</a>

	<h2>구매하고 싶은것 있어요?</h2>

	<form action="${root}/cart" method="post">
		<input type="text" name="product">
		<input type="submit" value="담아줘">
	</form>



	<h2>현재 장바구니 현황</h2>

	<c:if test="${empty cart }">

		<h2>아직 장바구니에 담은 상품이 없습니다.</h2>
	</c:if>
	<c:if test="${!empty cart }">
	<c:forEach items="${cart}" var="item" >
		<!-- div는 레이아웃을 나누는 태그 -->
		<div>${item}</div><br></c:forEach> </c:if>
		<form action="${root }/buy" method="post">
			>
			<input type="submit" value="구매하기">
		</form> 
	
</body>
</html>