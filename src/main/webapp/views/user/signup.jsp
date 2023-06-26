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
    <form action="/user/signup" method="post">
      <input type="text" name="id">
      <input type="text" name="password">
      <input type="text" name="name">
      <input type="submit" value="회원가입">
    </form>
</body>
</html>
