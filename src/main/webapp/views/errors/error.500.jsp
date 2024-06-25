<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>My Homepage</title>
<link type="text/css"
	rel="stylesheet"
	href="<c:url value="/css/home.css" />" />
</head>
<body>
  <div id="container">
	<jsp:include page="/WEB-INF/views/includes/header.jsp" />
	<jsp:include page="/WEB-INF/views/includes/navigation.jsp" />
	<div id="wrapper">
		<div id="content">
			<div id="site-introduction">
	
			<h1>ERROR CODE : 500</h1>
			<h2>무언가 잘못됐어요!!</h2>
			
			<p>어딘가 로직의 문제가 있어요</p>
			<p>알아보고 싶으면 어떻게 해보세요</p>

			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/views/includes/footer.jsp" %>
  </div>
</body>
</html>