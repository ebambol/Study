<%@page import="java.util.Date"%>
<html>
  <head>
    <title>Scripting Tag</title>
  </head>
  <body>
  	<%
  		int a = 10;
  		int b = 20;
  		int c = 30;
  		out.println(a+b+c);
  	%>
  	<%= a + b + c %>
  </body>
</html>