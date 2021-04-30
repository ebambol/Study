<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.oreilly.servlet.*" %>
    <%@ page import="com.oreilly.servlet.multipart.*" %>
    <%@ page import="java.util.*" %>
    <%@ page import="java.io.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		MultipartRequest multi = new MultipartRequest(request, "D:\\upload", 5*1024*1024,"utf-8",new DefaultFileRenamePolicy());
		Enumeration params = multi.getParameterNames();	//Enumeration으로 타입 변환
		
		while(params.hasMoreElements()){
			String name = (String)params.nextElement();	//요청 파라미터 이름을 가져옴
			String value = multi.getParameter(name);	//name값을 받음
			out.println(name + " = " + value +"<br>");
		}
		out.println("<hr>");
		
		Enumeration files = multi.getFileNames();	//input type="file"인 이름 반환
		
		while(files.hasMoreElements()){
			String name = (String)files.nextElement();
			String filename = multi.getFilesystemName(name);
			String original = multi.getOriginalFileName(name);
			String type = multi.getContentType(name);
			File file = multi.getFile(name);
			
			out.print("요청 파라미터 이름 : "+ name + "<br>");
			out.print("실제 파일 이름 : "+ original + "<br>");
			out.print("저장 파일 이름 : "+ filename + "<br>");
			out.print("파일 콘텐츠 유형 : "+ type + "<br>");
			
			if(file != null){
				out.println("파일 크기: "+file.length());
				out.println("<br>");
			}
		}
	%>
</body>
</html>