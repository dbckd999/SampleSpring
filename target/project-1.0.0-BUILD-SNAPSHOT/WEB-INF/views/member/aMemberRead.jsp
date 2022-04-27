<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세보기</title>
</head>
<body>
	<form action="/memberUpdate" method="post">
		고유번호: ${dto.m_no} <br>
		<input type="hidden" name="m_no" value="${dto.m_no}">
		ID: <input type="text" name="m_id" value="${dto.m_id}"> <br>
		PW: ${dto.m_pw} <br>
		주소: <input type="text" name="m_address" value="${dto.m_address}"> <br> 
		가입: ${dto.m_regDate} <br>
		<input type="submit" value="수정하기">
	</form>
</body>
</html>