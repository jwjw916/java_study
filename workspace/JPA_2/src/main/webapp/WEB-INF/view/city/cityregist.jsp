<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="/WEB-INF/view/include/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>도시등록</h1>

<c:if test="${!empty msg }">
${msg }</c:if>

<form method="post" action="/city/regist">
<input type="text" name="name" placeholder="도시명"><br>
<input type="text" name="district" placeholder="구역"><br>
<input type="text" name="population" placeholder="인구"><br>
<input type="text" name="countrycode" placeholder="국가코드"><br>
<input type="submit">
</form>


</body>
</html>