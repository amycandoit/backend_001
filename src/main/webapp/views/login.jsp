<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/user.css">
    <link rel="stylesheet" href="css/public.css">
    <title>LOGIN</title>
</head>
<body class="bodycolor2">
<header>
    <div class="top">
        <a href="/main"><p class="mainfont logo">PLAY DATA <br> STORY</p></a>
        <a href=""><p class="mainfont aboutus">About us</p></a>
    </div>
</header>
<section>
    <div class="login_main">
        <p class="main_text">L O G I N</p>

        <form  action="/login" method="post">

            <div class="login_input">
                <p class="user_text">ID</p>
                <input class="user_input" type="text" name="username" placeholder="아이디를 입력하세요">
            </div>
            <div class="login_input">
                <p class="user_text">PASSWORD</p>
                <input  class="user_input" type="password" name="password" placeholder="비밀번호를 입력하세요">
            </div>
                <input type="submit" class="user_botton" value="LOGIN">
        </form>
    </div>
</section>

</body>
</html>