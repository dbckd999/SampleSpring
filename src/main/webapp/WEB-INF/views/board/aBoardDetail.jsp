<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
<title>${dto.b_title}</title>
</head>
<body>
	<a href="boardList">보드 리스트로</a> <br>
	<c:if test="${sessionScope.m_id eq dto.b_writer}">
		<form action="ContentUpdate" method="post">
			제목: <input type="text" name="b_title" value="${dto.b_title}"> <br>
			내용: <input type="text" name="b_content" value="${dto.b_content}"> <br>
			작성자: ${dto.b_writer} <br>
			작성일: ${dto.b_reg_date} <br>
			<input type="submit" value="수정하기">
		</form>
	</c:if>
	<c:if test="${sessionScope.m_id != dto.b_writer}">
		제목: ${dto.b_title} <br>
		내용: ${dto.b_content} <br>
		작성자: ${dto.b_writer} <br>
		작성일: ${dto.b_reg_date} <br>
	</c:if>
	
	<input type="hidden" name="b_no" value="${dto.b_no}">
	
	<c:if test="${not empty sessionScope.m_id}">
		<input type="text" name="m_id" placeholder="ID" id="m_id" value="${sessionScope.m_id}" readonly>
		<input type="text" name="c_comment" placeholder="댓글" id="c_comment">
		<input type="button" value="댓글달기" id="addComment"><br>
	</c:if>
	<!-- comments -->
	<table id="commentList" border=1></table>
	<script src="${path}/resources/js/comment.js"></script>
</body>
</html>