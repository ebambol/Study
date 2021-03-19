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
				<a href="./welcome1.jsp" class="navbar-brand">welcome1</a>
					<a href="./welcome2.jsp" class="navbar-brand">welcome2</a>
					<a href="./welcome3.jsp" class="navbar-brand">welcome3</a>
				</div>
			</div>
		</nav>
		<%!
			String greeting = "Welcome 3 to Web Shopping Mall";
			String tagline = "Welcome 3 to Web Market!";
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
			<p>&copy; &lt;WebMarket&gt;</p>
		</footer>
	</body>
</html>
