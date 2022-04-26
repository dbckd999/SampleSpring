<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>보드 리스트</title>
</head>
<body>
	<h1>글 등록하기</h1>
	
	<form action="/boardInsert" method="post">
		글 제목: <input type="text" name="b_title"><br>
		글 내용: <input type="text" name="b_content"><br>
		작성자: <input type="text" name="b_writer" value="${sessionScope.m_id}" readonly><br>
		<input type="submit" value="작성하기"><br>
	</form>
	
	<a href="/boardList">목록으로</a>
</body>
</html>