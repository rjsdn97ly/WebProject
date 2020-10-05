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

	<h2>도서정보</h2>

	<c:forEach var="dto" items="${book }">
		제목 : <c:out value="${dto.title }" />
		<br> 작가 : <c:out value="${dto.author }" />
		<br> 출판사 : <c:out value="${dto.publisher }" />
		<br>
	</c:forEach>

</body>

</html>