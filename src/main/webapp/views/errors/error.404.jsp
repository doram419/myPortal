<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html lang="ko">

<head>
	<meta charset="UTF-8">
	<title>My Homepage</title>
	<link type="text/css"
		rel="stylesheet"
		href="<c:url value="/css/home.css" />" />
</head>

<body>
	<c:import url="/WEB-INF/views/includes/header.jsp"></c:import>
	<c:import url="/WEB-INF/views/includes/navigation.jsp"></c:import>
	 	
 	<div id="container">
		<div id="wrapper">
			<div id="content">
				<div id="site-introduction">
		
				<h1>ERROR CODE : 404</h1>
				<h2>워메~ 여기가 어디여</h2>
				
				<p>페이지를 못 찾겠습니다</p>
	
				</div>
			</div>
		</div>
	<c:import url="/WEB-INF/views/includes/footer.jsp"></c:import>
  	</div>
  	
</body>
</html>