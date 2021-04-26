<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="ch04.com.dto.Book" %>
<jsp:useBean id="BookDAO" class="ch04.com.dao.BookRepository" scope="request"></jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a href="./welcome.jsp" class="navbar-brand">Home</a>
			</div>
		</div>
	</nav>
	
	<%! String greeting="도서 목록"; %>
		<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>	
	<%ArrayList<Book> listOfBooks = BookDAO.getAllProducts(); %>
	<div class="container">
		<div class="col" align="left">
			<%for(int i=0;i<listOfBooks.size();i++){
				Book book=listOfBooks.get(i);
			%>
			<div class="col-lg">
				<h4>[<%=book.getCategory() %>] <%=book.getName() %></h4>
				<p><%=book.getDescription() %></p>
				<p><%=book.getAuthor()%> | <%=book.getPublisher() %> | <%=book.getUnitPrice() %>원</p>
			</div>
			<hr>
			<%} %>
		</div>
		<hr>
	</div>	
	<footer class="container">
		<p>&copy; BookMarket</p>
	</footer>
</body>
</html>