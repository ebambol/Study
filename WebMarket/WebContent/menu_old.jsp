<%@ page contentType="text/html; charset=utf-8" %>
		<nav class="navbar navbar-expand navbar-dark bg-dark">
			<div class="container">
				<div class="navbar-header">
					<a class="navbar-brand" href="./welcome.jsp">Home</a>
				</div>
				<div>
					<ul class="navbar-nav mr-auto">
						<li class="nav-item">
						<a class="nav-link" href="./products.jsp">상품목록</a>
						</li>
						<li class="nav-item">
						<a class="nav-link" href="./addProduct.jsp">상품등록</a>
						</li>
						<li class="nav-item">
						<a class="nav-link" href="./editProduct.jsp?edit=update">상품수정</a>
						</li>
						<li class="nav-item">
						<a class="nav-link" href="./editProduct.jsp?edit=delete">상품삭제</a>
						</li>
					</ul>
				</div>
				<!-- 아래 내용은 개발 후 삭제될 내용 -->
				<div class="navbar-header">
					<a class="navbar-brand" href="./welcome.jsp">Home</a>
					<a class="navbar-brand" href="./sub1.jsp">SUB1</a>
					<a class="navbar-brand" href="./sub2.jsp">SUB2</a>
					<a class="navbar-brand" href="./products.jsp">상품목록</a>
					<a class="navbar-brand" href="./addProduct.jsp">상품등록</a>
				</div>
			</div>
		</nav>