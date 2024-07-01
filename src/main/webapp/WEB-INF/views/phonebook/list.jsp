<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  
<!DOCTYPE html>

<html lang="ko">

<head>
	<meta charset="UTF-8">
	<title>전화번호부</title>
</head>

<body>

	<h2>주소록 Web</h2>
	<h3>목록 (검색어: )</h3>
	<form id="search-form">

		<label for="keyword">검색어</label> <input type="text" name="keyword">
		<input type="submit" value="검색">
	</form>
	
	<table id="phonebook" width="640" border="1">
		<c:forEach items="${peoplelist}" var="people" varStatus="status">
		<tr>
			<th class="col_name">이름</th>
			<th class="col_phone">휴대전화</th>
			<th class="col_phone">전화번호</th>
			<th class="col_toolbar">도구</th>
		</tr>
		<tr>
			<td>
				<!-- 이름을 출력하세요 -->
				${people.name}
			</td>
			<td>
				<!-- 휴대전화를 출력하세요 -->
				${people.phoneNumber}
			</td>
			<td>
				<!-- 전화번호를 출력하세요 -->
				${people.localNumber}
			</td>
			<td>
				<form method="POST" action="">
					<button type="submit">삭제</button>
				</form>
			</td>
		</tr>
		</c:forEach>
	</table>
		
	<p>
		<a href="">새 주소 추가</a>
</body>
</html>