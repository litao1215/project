<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/28/028
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="get" action="emp">
    请输入你的员工编号：<input type="text" name="empno"/><br/>
    请输入你的员工姓名：<input type="text" name="ename"/><br/>
    <input type="hidden" value="2" name="i"/><br/>
    <input type="submit" value="登录"/><br/>
</form>
</body>
</html>
