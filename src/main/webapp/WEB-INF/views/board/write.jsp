<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html lang="ko">
	<head>
		<title>My Homepage</title>
		<meta http-equiv="content-type" content="text/html; charset=utf-8">
		<link href="/myportal/css/board.css" type="text/css" rel="stylesheet">
	</head>
<body>
	<c:import url="/WEB-INF/views/includes/header.jsp"></c:import>
	<c:import url="/WEB-INF/views/includes/navigation.jsp"></c:import>
	
	<div id="container">
		<div id="content">
			<form method="post" action="<c:url value="/board/write"/>"
				enctype="multipart/form-data">
			<table border="1" width="640">
				<tr>
					<td><h3>게시판</h3></td>
				</tr>
				<tr>
					<th>글쓰기</th>
				</tr>
				<tr>
					<td>제목</td>
					<td> <input type="text" name="title" value=""> </td>
				</tr>
				<tr>
					<td>내용</td>
					<td colspan="2">
						<textarea id="content" name="content"> </textarea>
					</td>
				</tr>
				<tr>
					<td>
						<a href="<c:url value="/board/"/>">취소</a>
						<input type="submit" value="등록">
					</td>	
				</tr>
				<tr>
					<td>파일첨부</td>
					<td> <input type="file" name="file"/> </td>
				</tr>
			</table>
			</form>
		</div>
		<c:import url="/WEB-INF/views/includes/footer.jsp"></c:import>
	</div>
	
			
</body>
</html>
