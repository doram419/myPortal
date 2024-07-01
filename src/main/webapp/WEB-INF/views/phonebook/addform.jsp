<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전화번호부</title>
</head>
<body>
<h2>주소록 Web</h2>
<h3>새 주소 등록</h3>

<form
	id="add-form" 
	method="POST"
	action="">
	<input type="hidden" name="a" value="add">
	<label class="block-label" for="name">이름</label>
	<input type="text" id="name" name="name">
	<label class="block-label" for="hp">휴대전화</label>
	<input type="text" id="hp" name="hp">
	<label class="block-label" for="tel">집전화</label>
	<input type="text" id="tel" name="tel">

	<input class="block" type="submit" value="주소 등록"> 
</form>


<p><a href="">목록 보기</a>
</body>
</html>