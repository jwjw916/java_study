<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>도시 정보</h1>
	<ul>
		<li>도시 ID: ${city.id }
		<li>도시 이름: ${city.name }
		<li>도시 구역: ${city.district }
		<li>도시 인구: ${city.population }
	</ul>
	<a href="/">홈으로</a>
</body>
</html>