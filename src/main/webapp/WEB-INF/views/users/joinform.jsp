<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>회원 가입폼</title>
	<link type="text/css" rel="stylesheet"
		href="<c:url value="/css/guestbook.css"/>"/>
	<!-- 
	<script src="<c:url value="/javascript/user.js"/>"></script>
	 -->
</head>
<body>
	<!-- header import -->
	<c:import url="/WEB-INF/views/includes/header.jsp"></c:import>
	<!-- navigator import -->
	<c:import url="/WEB-INF/views/includes/navigation.jsp"></c:import>
	
	<div id="container">
		<div id="content">
			<h1>회원 가입</h1>
				<form:form
					modelAttribute="userVo"
					id="join-form"
					name="registerForm" 
					action="${pageContext.servletContext.contextPath }/users/join"
					method="POST"
					>
					<input type="hidden" name="a" value="join">
					
					<label for="name">이름</label>
					<!-- <input name="name" type="text" placeholder="이름을 입력하십시오"><br>  -->
					<form:input path="name" placeholder="이름을 입력하십시오" /> <br>
					<form:errors path="name" cssClass="error" />
				
					<%-- <!-- 이름 필드 메시지 -->
					<spring:hasBindErrors name="userVo">
					 	<c:if test="${errors.hasFieldErrors('name') }">
					 		<strong>
					 			<!-- hibernate 기본 방식으로 메시지 출력
					 			${errors.getFieldError( 'name' ).defaultMessage }
					 			-->
					 			<spring:message
									code="${errors.getFieldError('name').codes[0] }"
									text="${errors.getFieldError('name').defaultMessage }" />					 			
					 		</strong>
					 		<br>
					 	</c:if>
					</spring:hasBindErrors> --%>
					
					<label for="password">비밀번호</label>
					<!-- <input name="password" type="password" placeholder="비밀번호를 입력하십시오"><br> -->
					<form:input path="password" placeholder="비밀번호를 입력하십시오" /> <br>
					<form:errors path="password" cssClass="error" />
					<%--
					<spring:hasBindErrors name="userVo">
					 	<c:if test="${errors.hasFieldErrors('password') }">
					 		<strong>
					 			${errors.getFieldError( 'password' ).defaultMessage }
					 		</strong>
					 		<br>
					 	</c:if>
					</spring:hasBindErrors>
					--%>
				
					<label for="email">이메일</label>
					<form:input path="email" placeholder="이메일을 입력하십시오" /> <br>
					<form:errors path="email" cssClass="error" />
					<!-- <input type="text" name="email" placeholder="이메일을 입력하십시오."> -->
					<input type="button" id="check-email"
						data-target="<c:url value="/users/checkEmail" />"
						value="이메일 중복체크" /> 
					<input type="hidden" name="emailCheck" value="n"/>	
					<%--
					<spring:hasBindErrors name="userVo">
					 	<c:if test="${errors.hasFieldErrors('email') }">
					 		<br>
					 		<strong>
					 			${errors.getFieldError( 'email' ).defaultMessage }
					 		</strong>
					 		<br>
					 	</c:if>
					</spring:hasBindErrors>
					--%>
					
					<br>
				
					<!-- <label for="gender">성별</label> -->
					<form:radiobutton path="gender" value="F" label="여성"/> 
					<form:radiobutton path="gender" value="M" label="남성"/> <br>
					<form:errors path="gender" cssClass="error" />
					<!-- 
					<input type="radio" name="gender" value="M">남성</radio>
					<input type="radio" name="gender" value="F">여성</radio><br>
					 -->
					<%--
					<spring:hasBindErrors name="userVo">
					 	<c:if test="${errors.hasFieldErrors('gender') }">
					 		<strong>
					 			${errors.getFieldError( 'gender' ).defaultMessage }
					 		</strong>
					 		<br>
					 	</c:if>
					</spring:hasBindErrors>
					--%>
					
					<label for="agree">약관동의</label>
					<input type="checkbox" id="agree" name="agree" value="n"/>
					<input type="submit" value="전송"> 
				</form:form>
			</div>
	<c:import url="/WEB-INF/views/includes/footer.jsp"></c:import>
	</div>
</body>
</html>

