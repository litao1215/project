<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/11/28/028
  Time: 19:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px" width="100%" >
    <tr>
        <td style="text-align: center">员工编号</td>
        <td style="text-align: center">员工姓名</td>
        <td style="text-align: center">岗位名称</td>
        <td style="text-align: center">经理编号</td>
        <td style="text-align: center">入职时间</td>
        <td style="text-align: center">薪水</td>
        <td style="text-align: center">奖金</td>
        <td style="text-align: center">部门编号</td>
        <td style="text-align: center" colspan="2">操作</td>
    </tr>
    <c:forEach items="${emplist}" var="emp">
        <tr>
            <td style="text-align: center">${emp.empno}</td>
            <td style="text-align: center">${emp.ename}</td>
            <td style="text-align: center">${emp.job}</td>
            <td style="text-align: center">${emp.mgr}</td>
            <td style="text-align: center">${emp.hiredate}</td>
            <td style="text-align: center">${emp.sal}</td>
            <td style="text-align: center">${emp.comm}</td>
            <td style="text-align: center">${emp.deptno}</td>
            <td><a href='emp?i=3&empno=${emp.empno}'>删除</a></td>
            <td><a href='emp?i=4&empno=${emp.empno}&job=${emp.job}&hiredate=${emp.hiredate}&sal=${emp.sal}&comm=${emp.comm}&deptno=${emp.deptno}'>修改</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
