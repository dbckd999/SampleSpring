<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원목록</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>주소</td>
			<td>가입일</td>
		</tr>

		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.m_no}</td>
				<td><a href="/memberRead?m_no=${dto.m_no}">${dto.m_id}</a></td>
				<td>${dto.m_address}</td>
				<td><fmt:formatDate value="${dto.m_regDate}" pattern="yyyy-MM-DD HH:MM:ss" /></td>
				<td><a href="/memberDelete?m_no=${dto.m_no}">삭제</a></td>
			</tr>
		</c:forEach>
		
	</table>
	
	<a href="/">홈으로</a>
</body>
</html>