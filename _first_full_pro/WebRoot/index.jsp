<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>Home Page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<script>

	function test_post() {
		var xmlHttp = createXMLHttpRequest();
		xmlHttp.open("GET", "/test", true);
		xmlHttp.onreadystatechange = function() {
		//	if (xmlHttp.readyState == 4 && xmlHttp.status == 200) {
				alert(xmlHttp.responseText);
		//	}
		};		
	}
</script>
</head>

<body>
	
	<a herf="/test" method="get">你好</a>
	<form action="test" method="get">
		<input type="submit" value="确定"/>
	</form>
	<button onclick="test_post()">get</button>
	<br>
</body>
</html>
