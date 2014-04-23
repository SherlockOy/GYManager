<%@ page language="java" import="java.util.*" pageEncoding="GB18030"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
  <head>
  
    <base href="<%=basePath%>">
    
    <title>Gymanager</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<title>国关体育馆订场系统</title>
  
  <script type="text/javascript">
  function submit(){
  		submit();
  }
  </script>
  <script type="text/javascript">
  function refreshment(){ 
  		String day = request.getParameter("selected_day");
  		session.setAttribute("selected_day",day);
  		window.open("Badminton.jsp","yue");
  		}
  		</script>
  <style type="text/css">
#apDiv1 {
	position:absolute;
	width:1312px;
	height:220px;
	z-index:1;
}
#apDiv2 {
	position:absolute;
	width:293px;
	height:337px;
	z-index:2;
	left: 20px;
	top: 220px;
}
#apDiv3 {
	position:absolute;
	width:913px;
	height:456px;
	z-index:3;
	left: 350px;
	top: 220px;
}
#apDiv4 {
	position:absolute;
	width:1312px;
	height:220px;
	z-index:0;
	top: 460px;
}
#apDiv5 {
	position:absolute;
	width:170px;
	height:30px;
	z-index:5;
	left: 700px;
	top:200px;
}
#apDiv6 {
	position:absolute;
	width:170px;
	height:30px;
	z-index:5;
	left: 700px;
	top:330px;
}
</style>

</head>
<body align="center">

<div id="apDiv1"><img src="images/1.jpg" usemap="fenglaoshi" width="1312" height="220">
<map name="fenglaoshi">
<area shape="poly" coords="691,130,702,127,713,116,733,110,755,110,786,112,806,121,809,132,821,136,819,151,824,162,797,159,782,169,767,170,757,173,752,172,741,169,734,169,728,166,718,165,708,164,697,165,691,161,687,157,687,151,687,145,690,139" href="Information/preview.html" target="yue">
<area shape="poly" coords="829,159,825,145,829,136,838,133,851,125,862,120,873,120,883,119,893,121,903,120,905,120,917,123,933,125,939,128,946,131,947,138,954,142,960,143,960,148,962,153,952,158,945,161,929,164,917,169,907,171,894,171,883,168,871,168,860,168,850,163,839,163" href="Information/news.html" target="yue">
<area shape="poly" coords="969,154,966,146,975,134,992,130,998,120,1008,122,1012,110,1022,109,1032,108,1043,109,1049,112,1053,117,1059,121,1066,123,1073,120,1081,119,1089,120,1093,126,1093,131,1096,138,1104,142,1109,146,1108,153,1101,158,1092,160,1079,158,1073,160,1066,165,1055,168,1041,167,1032,166,1023,163,1019,164,1013,169,1001,170,996,163,981,161" href="Information/needtoknow.html" target="yue">
<area shape="poly" coords="1125,163,1115,153,1119,141,1126,140,1134,137,1135,133,1136,127,1141,122,1148,119,1156,123,1160,125,1167,127,1172,127,1175,121,1187,115,1199,114,1210,116,1218,123,1227,128,1236,132,1243,140,1245,147,1258,149,1259,157,1252,162,1227,164,1216,168,1203,173,1184,172,1171,169,1159,170,1150,171" href="Information/contact.html" target="yue">
<area shape="rect" coords="398,175,528,205" href="choosedate_badminton.jsp" target="yue">
<area shape="rect" coords="628,173,733,204" href="choosedate_pingpong.jsp" target="yue">
<area shape="rect" coords="867,175,957,205" href="choosedate_tennis.jsp" target="yue">
<area shape="rect" coords="1070,175,1160,205" href="choosedate_pool.jsp" target="yue">
</map></div>
<div id="apDiv2"><iframe frameborder="0" marginwidth="0" marginheight="0" name="feng" src="login.jsp" height="337px" width="293px" hspace="0" noresize scrolling="no"></iframe></div>
<div id="apDiv3"><iframe frameborder="0" marginwidth="0" marginheight="0" name="yue" src="choosedate_badminton.jsp" height="430px" width="940px" hspace="0"  noresize scrolling="yes"></iframe></div>
<div id="apDiv4"><img src="images/bottom.jpg" width="1312" height="220"></div>
<div id="apDiv5">
<!--<form name="form1" method="post">
 <input type="text" name="selected_date" onfocus="HS_setDate(this)" >
<input type="submit" value="tijiao"></form> -->
</div>

  </body>
</html>
