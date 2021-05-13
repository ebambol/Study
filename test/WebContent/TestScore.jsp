<%@page import="java.net.Inet4Address"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
    table,td,th {border: 1px solid;}
</style>
</head>
<body>

    <%
         

    	request.setCharacterEncoding("utf-8");
    
    	String name1 = request.getParameter("name1");
    	String name2 = request.getParameter("name2");
    	String name3 = request.getParameter("name3");
		String[] name = {"","",""};
    	int[] kor = {0, 0, 0};
		int[] eng = {0, 0, 0};
		int[] math = {0, 0, 0};
		int[] total = {0, 0, 0};
		int[] avg = {0, 0, 0};
		int[] score = {0,0,0};
    	for(int i=0; i<3; i++){
    		name[i] = request.getParameter("name"+(i+1));
    		kor[i] = Integer.parseInt(request.getParameter("kor"+(i+1)));
    		eng[i] = Integer.parseInt(request.getParameter("eng"+(i+1)));
    		math[i] = Integer.parseInt(request.getParameter("math"+(i+1)));
    		total[i] = kor[i] + eng[i] + math[i];
    		avg[i] = total[i]/3;
    		score[i] = avg[i];
    	}
        //순위
        int[] rank = {1,1,1};
        for(int i=0; i<score.length; i++){
            rank[i]=1;
            for(int j=0; j<score.length; j++){
            	if(score[i]<score[j]){
            		rank[i]++;
            	}
            }
        }
    %>
    <h1>성적처리</h1>
    <table>
        <tr>
            <th>학생이름</th>
            <th>국어점수</th>
            <th>영어점수</th>
            <th>수학점수</th>
            <th>합계</th>
            <th>평균</th>
            <th>등수</th>
        </tr>
        <%
        	for(int i=0;i<3; i++){
        		out.print("<tr>");
        		out.print("<td>"+name[i]+"</td>");
        		out.print("<td>"+kor[i]+"</td>");
        		out.print("<td>"+eng[i]+"</td>");
        		out.print("<td>"+math[i]+"</td>");
        		out.print("<td>"+total[i]+"</td>");
        		out.print("<td>"+avg[i]+"</td>");
        		out.print("<td>"+rank[i]+"</td>");
        		out.print("</tr>");
        	}
        %>
    </table>
     
</body>
</html>