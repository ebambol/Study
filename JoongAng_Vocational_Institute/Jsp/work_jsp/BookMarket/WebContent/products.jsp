<%@page import="dao.BookRepository"%>
<%@ page contentType="text/html; charset=UTF-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Book"%>
<jsp:useBean id="BookDAO" class="dao.BookRepository" scope="session" />
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<nav class="navbar navbar-expand navbar-dark bg-dark">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand" href="./welcome.jsp">Home</a>
			</div>
		</div>
	</nav>

	<%!String greeting = "도서 목록";%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>
	<%
		BookRepository dao = BookRepository.getInstance();
	ArrayList<Book> listOfBooks = dao.getAllProducts();
	%>
	<div class="container">
		<div class="col" align="L">
			<%
				for (int i = 0; i < listOfBooks.size(); i++) {
				Book book = listOfBooks.get(i);
			%>
			<div class="col-lg">
				<h4>
					[<%=book.getCategory()%>]
					<%=book.getName()%></h4>
				<p>
				<p><%=book.getDescription()%>
					<a href="./product.jsp?id=<%=book.getBookId()%>" class="btn btn-secondary rold="button">상세 정보 &raquo</a>
				<p><%=book.getAuthor()%>|<%=book.getPublisher()%>|<%=book.getUnitPrice()%>원
			</div>
			<hr>
			<%
				}
			%>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>