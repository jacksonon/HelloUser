<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <jsp:useBean id="user" scope="request" class="wangjiawei.User"></jsp:useBean>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title> 简单的jsp+servlet界面 </title>
</head>
<body>
  <%
  request.setCharacterEncoding("utf-8");
  if (user.getUserName() != null) {
	  if (user.getUserName().equals("")) {
  %>
        请输入姓名:
  <%
	  } else {
  %>
        欢迎你，<%= user.getUserName() %> <br/>
  <%
	  }
  }
  %>
  
  <!-- 表单 action标识servlet的地址 -->
  <form action="helloUser" method="post">
    用户名：<input type="text" name="USERNAME"/> <br/>
          <input type="submit" name="submit" value="提交"/>
  </form>
</body>
</html>