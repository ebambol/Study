<%@page import="java.util.ArrayList"%>
<%@page import="dao.BookRepository"%>
<%@page import="dto.Book" %>
<%@ page contentType="text/html; charset=UTF-8"%>
<jsp:useBean id="BookDAO" class="dao.BookRepository" scope="session"></jsp:useBean>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Welcome</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	<%! String greeting="도서 목록"; %>
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
				for (int i=0; i<listOfBooks.size(); i++){
				Book book = listOfBooks.get(i);	
			%>
			<div class="col-lg">
				<h4>[<%=book.getCategory() %>] <%=book.getName() %></h4>
				<p><%=book.getDescription() %></p>
				<p><%=book.getAuthor() %> | <%=book.getPublisher() %> | <%=book.getUnitPrice() %>원</p>
				<p><a href="./product.jsp?id=<%=book.getBookId() %>" class="btn btn-secondary" rold="button">상세 정보 &raquo;</a></p>
			</div>
			<hr />
			<%
			}
			%>
		</div>
	</div>
	<jsp:include page="footer.jsp" />
</body>
</html>