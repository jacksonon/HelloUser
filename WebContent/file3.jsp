<%@page import="java.net.URLDecoder"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>URL传递中文参数</title>
</head>
<body>
 
  <font size="4">
    <%
      String str = request.getQueryString();
      if (str != null) {
    	  String strl = URLDecoder.decode(str, "utf-8");
    	  String[] paraStrings = strl.split("&");
    	  if (paraStrings.length > 0)
    		  out.print("请求参数如下：<br/>");
    	  for (String paraString : paraStrings) {
    		  String[] nameValue = paraString.split("=");
    		  out.println(nameValue[0] + ":" + nameValue[1] + "<br/>");
    	  }
      }
    %>
    
    <form action="file3.jsp" method="get">
      用户名: <input type="text" name="name" size="10"/><br>年龄: <input type="text" name="age" size="10"
      /> <br> <input type="submit" value="提交">
    </form>
  </font>

</body>
</html>