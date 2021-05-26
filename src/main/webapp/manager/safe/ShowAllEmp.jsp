<%@ page import="java.util.List" %>
<%@page  import="com.qf.empproject.entity.Emp" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2021/1/26
  Time: 17:46
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>所有员工信息表</title>
</head>
<body>
         <table border="1">
             <tr>
                 <td>工号</td>
                 <td>姓名</td>
                 <td>薪水</td>
                 <td>年龄</td>
                 <td colspan="2">操作</td>
             </tr>
             <c:forEach var="emp" items="${requestScope.emps}">
                 <tr>
                     <td>${emp.id}</td>
                     <td>${emp.name}</td>
                     <td>${emp.salary}</td>
                     <td>${emp.age}</td>

                     <td><a href="<c:url context='${pageContext.request.contextPath}' value='/manager/safe/removeEmpController?id=${emp.id}'></c:url>">删除</a></td>

                     <td><a href="<c:url context='${pageContext.request.contextPath}' value='/manager/safe/SelectOneEmp?id=${emp.id}'></c:url>">修改</a></td>
                 </tr>

             </c:forEach>
             <tr>
                 <td colspan="6">
                     <a href="<c:url context='${pageContext.request.contextPath}'
                     value='/manager/safe/ShowAllEmp?PageIndex=1'> </c:url>">首页</a>
                     <c:if test="${requestScope.page.pageIndex>1}">
                     <a href="<c:url context='${pageContext.request.contextPath}'
                     value='/manager/safe/ShowAllEmp?PageIndex=${requestScope.page.pageIndex-1}'></c:url>">上一页</a>
                     </c:if>
                     <c:if test="${requestScope.page.pageIndex==1}">
                         <a>上一页</a>
                     </c:if>

                     <c:if test="${requestScope.page.totalPage>requestScope.page.pageIndex}">
                     <a href="<c:url context='${pageContext.request.contextPath}'
                     value='/manager/safe/ShowAllEmp?PageIndex=${requestScope.page.pageIndex+1}'></c:url>">下一页</a>
                     </c:if>

                     <a href="<c:url context='${pageContext.request.contextPath}' value='/manager/safe/ShowAllEmp?PageIndex=${page.totalPage}'></c:url> ">尾页</a>
                 </td>
             </tr>

         </table>


</body>
</html>
