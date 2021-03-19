<html>
	<head>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<title>Welcome 1</title>
	</head>
	<body>
	<%@ include file="menu.jsp" %>
		<%!
			String greeting = "웹쇼핑몰1에 오신걸 환영합니다.";
			String tagline = "Welcome 1 to Web Market!";
		%>
		<div class="jumbotron">
			<div class="container">
				<h1 class="display-3"><%= greeting %></h1>
			</div>
		</div>
		<div class="container">
			<div class="text-center">
				<h3><%= tagline %></h3>
			</div>
		</div>
		<footer class="container">
			<p>&copy; WebMarket</p>
		</footer>
	</body>
</html>

