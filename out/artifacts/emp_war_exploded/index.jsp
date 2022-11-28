<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2022/11/28
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="emp" method="get">
    <h1>注册</h1>
    用户编号：<input type="text" name="empno"><br>
    用户姓名：<input type="text" name="ename"><br>
    用户工作：<input type="text" name="job"><br>
    经理编号：<input type="text" name="mgr"><br>
    入职日期：<input type="date" name="hiredate"><br>
    员工工资：<input type="text" name="sal"><br>
    员工奖金：<input type="text" name="comm"><br>
    部门编号：<input type="text" name="deptno"><br>
    <input type="hidden" value="1" name="i">
    <input type="submit" value="注册">
  </form>
  </body>
</html>
