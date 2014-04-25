<%@ page language="java" contentType="text/html; charset=gbk"%>

<%@page import="java.util.*,com.sherlockoy.po.User"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>社区主页</title>
<script type="text/javascript">
function open_orders(){
	window.open("checkorders.jsp","yue");
	
}
</script>
</head>
<body background="images/welcomeback.jpg">

		
		<div id="secondarycontent">

			<!-- secondary content start -->
 			<!-- 从会话中取出用户名，读者请注意此处的Java表达式运用 ，包括了取会话的操作-->
			<font color="#00a0e9" align="center"><h2><%=((User)session.getAttribute("userInfo")).getUserName() %>，已登录</h2></font>
			
			<!-- secondary content end -->

		</div>
</body>	
