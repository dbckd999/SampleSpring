<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보드 리스트</title>
</head>
<body>
	<h1>글목록</h1>
	<a href="boardInsert">글 작성하기</a>
	<a href="/">홈으로</a>
	<table border=1>
		<tr>
			<td>글번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
		</tr>
		
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.b_no}</td>
				<td><a href="/aContentRead?b_no=${dto.b_no}">${dto.b_title}</a></td>
				<td>${dto.b_writer}</td>
				<td><fmt:formatDate value="${dto.b_reg_date}" pattern="yyyy-MM-DD HH:MM:ss" /></td>
				<td><a href="/aContentDelete?b_no=${dto.b_no}">삭제</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>