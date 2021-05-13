<html>
	<head>
		<link rel="stylesheet" 
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<title>Welcome 3</title>
	</head>
	<body>
		<%@ include file="menu.jsp" %>
		<%!
		String greeting = "Welcome 3 to Web Shopping Mall";
		String tagline = "Welcome 3 to Web Market!";
		%>
		<div xclass="jumbotron">
			<div xclass="container">
				<h1	xclass="display-3">
					<%= greeting %>
				</h1>
			</div>
		</div>
		<div class="container">
			<div class="text-center">
				<h3>
					<%= tagline %>
				</h3>
			</div>
			<hr>
		</div>
		<footer class="container">
			<p>&copy; WebMarket</p>
		</footer>		
	</body>
</html>






