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
     <fieldset id="join-container">
        <legend>회원가입</legend>
        <div class="join-padding">
            <label for="id">
            <p>아이디 <span id="essential">*</span></p>
            <input type="text" id="id">
            </label>
        </div>

        <div class="join-padding">
            <label for="pw">
            <p>패스워드 <span id="essential">*</span></p>
            <input type="password" id="pw">
        </label> 
        </div>

        <div class="join-padding">
                   <label for="pw">
            <p>패스워드 확인 <span id="essential">*</span></p>
            <input type="password" id="pw">
        </label> 
        </div>
        <div class="join-padding">
        <label for="mail">
            <p>이메일 <span id="essential">*</span></p>
            <input type="email" id="mail">
        </label>
        </div>
        <div class="join-div">
            <label for="cb">
            <input type="checkbox"id="cb" class="cb"> 약관에 동의함
        </label>
        </div>
        <div class="join-div">
            <button>회원가입</button>
        </div>
    </fieldset>
    <footer>
        <span>책드림</span>
    </footer>
</div>
</body>
</html>