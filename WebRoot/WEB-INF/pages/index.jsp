<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script src="https://code.jquery.com/jquery-3.3.1.min.js"></script>
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	
	<script type="text/javascript">
		window.onload=function(){
			//var div1 = document.getElementById("div1");
			//div1.onclick = function(){
				//alert("点击了");
			//}
			$("#div1").click(function(){
			  alert("jquery事件");
			});
		}
	</script>
  </head>
  
  <body>
    This is my JSP page. <br>
    1212
    <a href="/HelloSpringMVC/hello">连接</a>
    <div id="div1">可点击</div>
  </body>
</html>
