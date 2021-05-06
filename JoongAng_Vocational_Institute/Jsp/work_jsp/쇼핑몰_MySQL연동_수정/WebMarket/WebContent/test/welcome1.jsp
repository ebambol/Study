<html>
	<head>
		<link rel="stylesheet" 
			href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
		<title>Welcome 1</title>
	</head>
	<body>
		<%@ include file="menu.jsp" %>
		<%!
		String greeting = "웹쇼핑몰1에 오신것을 환영합니다.";
		String tagline = "Welcome 1 to Web Market!";
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






