<%@ page language="java" contentType="text/html; charset=gbk"%>

<%@page import="java.util.*,po.User"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>������ҳ</title>
<script type="text/javascript">
function open_orders(){
	window.open("checkorders.jsp","yue");
	
}
</script>
</head>
<body background="images/welcomeback.jpg">

		
		<div id="secondarycontent">

			<!-- secondary content start -->
 			<!-- �ӻỰ��ȡ���û�����������ע��˴���Java���ʽ���� ��������ȡ�Ự�Ĳ���-->
			<font color="#00a0e9" align="center"><h2><%=((User)session.getAttribute("userInfo")).getUserName() %>���ѵ�¼</h2></font>
			
			<!-- secondary content end -->

		</div>
</body>	
