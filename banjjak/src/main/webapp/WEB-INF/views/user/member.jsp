<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>

<title>Member</title>
	<link rel="stylesheet" href="/resources/css/styles.css">
	<link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet">

</head>
<body>
<jsp:include page="../layouts/header2.jsp"/>

	<div class="container">
       <img src="/resources/images/logo.png">
    </div>
	
	<h4>회원 가입</h4>
	<form:form modelAttribute="member" method="post">
		<div>
		<label for="userId">아이디</label>
		<input type="text" id="userId">
		</div>
		<div>
		<label for="userName">이름</label>
		<input type="text" id="userName">
		</div>
		<div>
		<label for="nickname">닉네임</label>
		<input type="text" id="nickname">
		</div>
		<div>
		<label for="password">비밀번호</label>
		<input type="text" id="password">
		</div>
		<div>
		<label for="email">이메일</label>
		<input type="text" id="email">
		</div>
		<div>
	
		<p><input type="submit" value="가입하기"/>
		<input type="reset" value="다시쓰기"/>
	</form:form>	       

<jsp:include page="../layouts/footer.jsp"/>
</body>
</html>