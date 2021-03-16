<html>
	<head>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
		<title>Welcome</title>
	</head>
	<body>
		<nav class ="navbar navbar-expand navbar-dark bg-dark">
			<div class="container">
				<div class="navbar-header">
					<a href="./welcome.jsp" class="navbar-brand">home</a>
				</div>
			</div>
		</nav>
		<%!
			String greeting = "Welcome to Web Shopping Mall";
			String tagline = "Welcome to Web Market!";
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
