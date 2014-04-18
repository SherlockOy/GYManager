<%@ page language="java" contentType="text/html; charset=gbk"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>

<title>µÇÂ½½çÃæ</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<style type="text/css">
#apDiv1 {
	position: absolute;
	width: 208px;
	height: 225px;
	z-index: 1;
	left: 51px;
	top: 80px;
}

#apDiv2 {
	position: absolute;
	width: 175px;
	height: 37px;
	z-index: 2;
	left: 16px;
	top: 34px;
}

#apDiv3 {
	position: absolute;
	width: 175px;
	height: 38px;
	z-index: 2;
	left: 16px;
	top: 109px;
}

#apDiv4 {
	position: absolute;
	width: 45px;
	height: 17px;
	z-index: 2;
	top: 208px;
	left: 92px;
}

#apDiv5 {
	position: absolute;
	width: 45px;
	height: 23px;
	z-index: 2;
	left: 215px;
	top: 304px;
}
</style>
<script>
	function submit() {
		submit();
	}
</script>
</head>

<body background="images/login.jpg">
	<div id="apDiv1">
		<form id="form1" action="login.action" method="post">
			<div id="apDiv2">
				<input type="Text" name="userName">
			</div>
			<div id="apDiv3">
				<input type="password" name="passWord">
			</div>
			<div id="apDiv4">
				<input type="image" src="images/ok.jpg" onclick="submit()"
					height="16" width="40" boder="0">
			</div>
		</form>
	</div>
	<div id="apDiv5">
		<img usemap="#fengdashi" src="images/to_regist.jpg" width="40"
			height="20" />
		<map name="fengdashi">
			<area shape="rect" coords="-122,-25,90,144" href="register.jsp"
				target="feng">
		</map>
	</div>
</body>
</html>
