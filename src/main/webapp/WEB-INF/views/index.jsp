<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Sample 대문</title>
<link rel="stylesheet" href="${path}/resources/css/mine.css">
</head>
<body>
	<c:if test="${not empty sessionScope.m_id}">
		${m_id}님 환영합니다.<br>
		<a href="/logout">로그아웃</a>
	</c:if>
	<c:if test="${empty sessionScope.m_id}">
		<form action="login" method="post">
			ID: <input type="text" name="m_id">
			PW: <input type="text" name="m_pw">
			<input type="submit" name="로그인">
		</form>
		<a href="/memberInsert">회원가입</a>
	</c:if>
	<a href="/boardList">글목록 보러가기</a>
	<a href="/memberList">회원보기</a>
	
	<script>
		<c:if test="${msg==false}">
			alert("로그인 실패");
		</c:if>
	</script>
</body>
</html>