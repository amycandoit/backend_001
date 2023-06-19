<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/user.css">
    <link rel="stylesheet" href="css/public.css">
    <title>SIGNUP</title>
</head>
<body class="bodycolor2">
<header>
    <div class="top">
        <a href="/main"><p class="mainfont logo">PLAY DATA <br> STORY</p></a>
        <a href=""><p class="mainfont aboutus">About us</p></a>
    </div>
</header>
<section>
    <form class="signup_main" action="/signup" method="post">
        <p class="main_text">S I N G U P</p>
        <div>
            <p class=" user_text">ID</p>
            <input class="user_input" type="text" name="username" placeholder="아이디를 입력하세요">
<%--            <input class="idchk_btn" type="button" onclick="fn_idChk();" value="중복확인">--%>
        </div>
        <div>
            <p class=" user_text">PASSWORD</p>
            <input  class="user_input" type="password" name="password" placeholder="비밀번호를 입력하세요">
        </div>
        <div>
            <p class=" user_text">USER NAME</p>
            <input  class="user_input" type="text" name = "name" placeholder="유저이름을 입력하세요">
        </div>
        <div>
            <input type="submit" class="user_botton" value="SIGN UP">
        </div>
    </form>
</section>
</body>
</html>