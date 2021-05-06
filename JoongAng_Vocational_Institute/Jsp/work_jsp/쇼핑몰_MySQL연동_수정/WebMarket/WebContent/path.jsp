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
    /* 현재  JSP 페이지가 실행되고 있는 절대 경로를 반환해 준다 */
    // D:\jsp\work_jsp\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\wtpwebapps\WebMarket\
	
    //String realFolder = request.getRealPath("");
    
    /* 현재  JSP 페이지가 실행되고 있는 절대 경로에 
               하위 폴더 경로 resources\\images 를 추가해서 반환해 준다 */
    String realFolder = request.getRealPath("resources\\images");
	out.println(realFolder);
%>
</body>
</html>