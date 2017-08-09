<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JQuery&&Ajax示例</title>
<script src="jquery-3.2.1.min.js"></script>
</head>
<script>
	$(document).ready(function() {
		$("input:radio").click(function() {
			//动作触发后执行的语句
			//获取当前点击的radio按钮的value
			var val = $('input:radio[name=dept]:checked').val();
			$.ajax({
				url: "ajax",
				type: "post",
				data: {
					dept: val
				},
				success: function(result) {
					var data = "<h5>课程如下: </h5>" + result;
					//获取指定位置的东西，然后调用加载数据方法
					$("#bookList").html(data);
				}
			});
		});
	});
</script>
<body>
	<form>
		<h3>请选择一个按钮，查看该按钮下隐藏内容</h3>
		<input type="radio" name="dept" value="1">计算机系
		<input type="radio" name="dept" value="2">工商管理
		<input type="radio" name="dept" value="3">变态医学
		<br/>
		<div id="bookList"></div>
	</form>
</body>
</html>