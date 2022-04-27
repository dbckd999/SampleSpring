<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세보기</title>
</head>
<body>
	고유번호: ${dto.m_no}
	ID: ${dto.m_ID}
	PW: ${dto.m_PW}
	주소: ${dto.m_address}
	가입: ${dto.m_regDate}
	<a href="/memberUpdate">수정하기</a>
</body>
</html>