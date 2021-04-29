<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>선택한 과일</h3>
	<%
	request.setCharacterEncoding("utf-8");
	String[] result = request.getParameterValues("fruit");
	
	if(result != null){
		for(int i=0; i<result.length; i++){
			out.print(result[i]+" ");
		}
	}
	%>
</body>
</html>