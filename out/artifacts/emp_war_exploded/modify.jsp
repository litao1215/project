<%--
  Created by IntelliJ IDEA.
  User: 20148
  Date: 2022/11/28
  Time: 21:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>修改前页面</h1>
<form>
    岗位编号：<input type="text" value="${emp.empno}" readonly/><br/>
    岗位名称：<input type="text" value="${emp.job}" readonly/><br/>
    入职时间：<input type="text" value="${emp.hiredate}" readonly/><br/>
    工资：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" value="${emp.sal}" readonly/><br/>
    奖金：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" value="${emp.comm}" readonly/><br/>
    部门编号：<input type="text" value="${emp.deptno}" readonly/><br/>
</form>

<h1>修改后页面</h1>
<form method="get" action="emp">
    请输入员工编号：<input type="text" name="empno" value="${emp.empno}" readonly><br/>
    请输入岗位名称：<input type="text" name="job"/><br/>
    请输入入职时间：<input type="date" name="hiredate"/><br/>
    请输入工资：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="sal"/><br/>
    请输入奖金：&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type="text" name="comm"/><br/>
    请输入部门编号：<input type="text" name="deptno"/><br/>
    <input type="hidden" name="i" value="5">
    <input type="submit" value="修改"/>
</form>
</body>
</html>
