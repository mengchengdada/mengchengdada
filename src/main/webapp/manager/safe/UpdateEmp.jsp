<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/1/27
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息修改页面</title>
</head>
<body>
     <form action="${pageContext.request.contextPath}/manager/safe/UpdateEmp" method="post">
       工号:<input type="text" name="id" value="${requestScope.emp.id}" readonly><br>
       姓名：<input type="text" name="name" value="${requestScope.emp.name}"><br>
       薪水：<input type="text" name="salary" value="${requestScope.emp.salary}"><br>
       年龄：<input type="text" name="age" value="${requestScope.emp.age}"><br>
        <input type="submit" value="提交">
     </form>
</body>
</html>
