<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%!
      private static final String DEFAULT_USER = "Guest";
    %>
    <%
      request.setCharacterEncoding("utf-8");
      String user = request.getParameter("user");
      if (user == null)
    	  user = DEFAULT_USER;
      else 
    	  //处理页面中文乱码情况：网络传输，字符集转换
    	  //user = new String(request.getParameter("user").getBytes("iso-8859-1"), "utf-8");
     	  user = request.getParameter("user");
    %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎界面：使用request对象</title>
</head>
<body>
  欢迎你，<%= user %> <br/><br/>
  <form action="welcome.jsp" method="post">
    用户名:<br/>
      <input type="text" name="user"/> <br/>
      <input type="submit" value="提交"/>
  </form>
</body>
</html>