<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="ko">
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>로그인</title>
</head>
<body>
		<header>
		<%@ include file="menu.jsp" %>		
		</header>
	<div id="container">
    <form id="login-container">
        <fieldset id="login-fieldset">
            <legend>로그인</legend>
            <div id="login-div">
                <div id="id-div">
                    <label for="id-input">
                    <span>아이디</span>
                    <input type="text" id="id-input" name="아이디">
                    </label><br/>
                </div>
                <label for="pw-input">
                    <span>패스워드</span>
                <input type="password" id="pw-input" maxlength="12" name="패스워드">
                </label>
            </div>
            <button id="login-button">로그인</button>
            <div id="login-etc">
                <a href="#" id="login-etc-border">회원가입</a>
                <a href="#">아이디 비밀번호 찾기(미구현)</a>
            </div>
        </fieldset>
    </form>
    
    <footer>
        <span>책드림</span>
    </footer>
	</div>
</body>
</html>