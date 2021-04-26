<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="person" class="ch04.com.dao.Person" scope="request"></jsp:useBean>
	<jsp:setProperty property="person" name="20182005"/>
	<jsp:setProperty property="person" name="홍길동"/>
	<p>아이디: <%out.print(person.getId()); %></p>
	<p>패스워드: <%out.print(person.getName()); %></p>
</body>
</html>