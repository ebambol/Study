<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="css/style.css"/>
	<title>책드림</title>
</head>
<body>
<div id="container">
		<header>
		<%@ include file="menu.jsp" %>		
		</header>
    <div id="container">
        <div id="book">
            <img src="images/book1.jpg" alt="책1">
            <h1>책제목</h1>
            <button>구매하기</button>
        </div>
        <div id="book">
            <img src="images/book1.jpg" alt="책1">
            <h1>책제목</h1>
            <button>구매하기</button>
        </div>
        <div id="book">
            <img src="images/book1.jpg" alt="책1">
            <h1>책제목</h1>
            <button>구매하기</button>
        </div>
    </div>
    <footer>
        <span>책드림</span>
    </footer>
   </div>
</body>
</html>