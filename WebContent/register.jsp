<%@ page language="java" contentType="text/html; charset=gbk"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>ÉçÇøÖ÷Ò³</title>
<style type="text/css">
#apDiv1 {
	position:absolute;
	width:50px;
	height:32px;
	z-index:1;
	left: 212px;
	top: 304px;
	overflow: visible;
}
#apDiv2 {
	position:absolute;
	width:198px;
	height:196px;
	z-index:2;
	left: 72px;
	top: 53px;
}
</style>
<script type="text/javascript">
function submit(){
	submit();
}
</script>
</head>
<body background="images/register.jpg">
<div id="apDiv2">
<form id="form1" name="form1" method="post" action="register.action"><pre>
<input type="text" name="userName" >

<input type="password" name="passWord">

<input type="text" name="realName">

<input type="text" name="phone">

<input type="text" name="email">
                            
     
          <input type ="image" onclick="submit()" src="images/register_btn.jpg" height="20" width="40" border="0" >
</pre>
</form>
</div>
<div id="apDiv1"><img usemap="#fengdashi" src="images/back_btn.jpg" width="40" height="20" />
<map name="fengdashi"><area shape="rect" coords="-122,-25,90,144" href="login.jsp" target="feng"></map></div>
</body>
</html>

