<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>이 파일은 first.jsp파일입니다.</h3>
	<jsp:include page="import_second.jsp" flush="false" />
	<p>Java Server Page</p>
</body>
</html>