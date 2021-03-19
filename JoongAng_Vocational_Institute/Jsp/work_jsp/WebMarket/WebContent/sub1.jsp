<%@page import="java.util.Locale"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.time.LocalDateTime"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.Date"%>
<html>
<head>
<meta charset="utf-8">
<!-- CSS only -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>Welcome</title>
</head>
<body>
	<%@ include file="menu.jsp"%>
	<%!String greeting = "SUB1에 오신것을 환영합니다.";
	String tagline = "Welcome to Web Market!";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3"><%=greeting%></h1>
		</div>
	</div>
	<div class="container">
		<div class="text-center">
			<h3><%=tagline%></h3>
			<%
				/*
			Date day = new Date();
			String am_pm;
			int hour = day.getHours();
			int minute = day.getMinutes();
			int second = day.getSeconds();
			if ((hour / 12) == 0) {
			am_pm = "AM";
			} else {
			am_pm = "PM";
			hour = hour - 12;
			}

			String ct = hour + ":" + minute + ":" + second + " " + am_pm;
			out.println("현재 접속 시간: " + ct + "\n");
			*/
			out.println("현재 접속 시간 : " + LocalDateTime.now()
					.format(DateTimeFormatter.ofPattern("yyyy년 MM월 dd일 a hh시 mm분 ss초").withLocale(Locale.ENGLISH)));
			%>
		</div>
	</div>
	<%@ include file="footer.jsp"%>
</body>
</html>