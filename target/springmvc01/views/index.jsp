<%--
  Created by IntelliJ IDEA.
  User: 96489
  Date: 2020/10/4
  Time: 21:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Index</title>
    <link rel="stylesheet" type="text/css" href="../statics/css/index.css">
</head>
<body>
<h2>Test success!</h2><br/>
<form action="/login" method="post">
    用户名：<input type="text" name="username" value="${user.username }"/><br/>
    密码：<input type="password" name="password" value="${user.password }"/><br/>
    <input type="submit" value="登录"/>
</form>

</body>
</html>
