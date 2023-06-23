<%@ page language="java" pageEncoding="UTF-8"%>
<html>
<body>
<h2>Hello World! 안녕 월드!</h2>
<p>${serverTime}</p>
<form method="post" action="/user/test2">
    <input type="text" name="id" placeholder="Insert ID" required>
    <input type="text" name="pw" placeholder="Insert PASSWOR" required>
    <input type="submit" >
</form>
</body>
</html>
