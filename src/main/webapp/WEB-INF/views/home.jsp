<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
	<%-- <C:if test="${userId eq null }">
	</C:if> --%>
	
	<a href ="https://kauth.kakao.com/oauth/authorize?response_type=code&client_id=5c0cffe84976369225c016a1e22ac8f6&redirect_uri=http://localhost:9092/example/" >
	    <img src="resources/images/kakao_login_medium_narrow.png">
	</a>
	
	<%-- <C:if test="${userId ne null }">
		<h1>로그인 성공입니다.</h1>
	</C:if> --%>
</body>
</html>
