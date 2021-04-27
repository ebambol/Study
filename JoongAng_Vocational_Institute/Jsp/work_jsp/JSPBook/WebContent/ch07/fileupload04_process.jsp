<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="org.apache.commons.fileupload.*,java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String path = "C:\\upload";
	
		DiskFileUpload upload =new DiskFileUpload();	//객체 생성
		
		upload.setSizeMax(1000000);		//최대 파일 크기
		upload.setSizeThreshold(4096);	//메모리상에 저장할 최대 크기
		upload.setRepositoryPath(path);	//임시로 저장할 디렉토리
		
		List items = upload.parseRequest(request);	//multipart/form-data 파라티머 가져옴
		Iterator params = items.iterator();
		
		while (params.hasNext()){
			FileItem item = (FileItem) params.next();
			
			if(item.isFormField()){
				String name = item.getFieldName();
				String value = item.getString();
				out.println(name + "=" + value + "<br>");
			} else {
				String fileFieldName = item.getFieldName();
				String fileName = item.getName();
				String contentType = item.getContentType();
				
				fileName = fileName.substring(fileName.lastIndexOf("\\")+1);
				long fileSize = item.getSize();
				
				File file = new File(path + "/" + fileName);
				item.write(file);
				
				out.println("-------------------------<br>");
				out.println("요청 파라미터 이름 : " + fileFieldName + "<br>");
				out.println("저장 파일 이름 : " + fileName + "<br>");
				out.println("파일 콘텐츠 타입 : " + contentType + "<br>");
				out.println("파일 크기 : " + fileSize);
			}
		}
	%>
</body>
</html>