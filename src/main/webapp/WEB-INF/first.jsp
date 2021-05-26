<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  Now:<%=new java.util.Date()%>
  <%%>
  ${pageContext.request.contextPath}
</body>
</html>