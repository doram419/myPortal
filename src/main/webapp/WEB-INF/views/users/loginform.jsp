<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>

<html lang="ko">

<head>
	<meta charset="UTF-8">
		<title>My Homepage</title>
		<link type="text/css" rel="stylesheet" 
			href="<c:url value="/css/users.css"/>"/>
</head>

<body>
	<!-- header import -->
	<c:import url="/WEB-INF/views/includes/header.jsp">
	</c:import>
	
	<!-- navigation import -->
	<c:import url="/WEB-INF/views/includes/navigation.jsp">
	</c:import>

	<div id="container">
		<div id="content">
			<form id="login-form" 
				name="loginform" 
				method="POST" 
				action="<c:url value="/users/login"/>">
				
				<label class="block-label" for="email">이메일</label> 
				<input id="email" name="email" type="text" value=""> 
		
				<label class="block-label">패스워드</label> 
				<input name="password" type="password" value="">
		
				<input type="submit" value="로그인">
			</form>
		</div>
	 <!-- footer import -->
    <c:import url="/WEB-INF/views/includes/footer.jsp"></c:import>
    </div>
</body>

</html>