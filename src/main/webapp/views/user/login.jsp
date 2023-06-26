<%--
  Created by IntelliJ IDEA.
  User: playdata
  Date: 2023-06-26
  Time: 오후 7:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="/user/login" method="post">
        <input type="text" name="id" >
        <input type="text" name="password">
        <input type="submit" value="로그인">
    </form>
    <a href="/user/signup">회원가입</a>
</body>
</html>
