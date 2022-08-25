<%--
  Created by IntelliJ IDEA.
  User: org
  Date: 2022/08/25
  Time: 2:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/css/signinStyle.css">
</head>
<body>
    <form action="/auth/signin" method="post">
        <input type="text" placeholder="ID 입력">
        <input type="password" placeholder="PW 입력">
        <input type="submit" value="로그인">
    </form>
</body>
</html>
