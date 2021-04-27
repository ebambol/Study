<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	//현재 JSP 페이지가 실행되고 있는 절대 경로를 반환
	//String realFolder = request.getRealPath("");
	//현재 JSP 페이지가 실행되고 있는 절대 경로의 resources/images반환
	String realFolder = request.getRealPath("resources\\images");
	out.println(realFolder);
%>
</body>
</html>