 <!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>
    hello! list
    <#list users as u>
    	<span>${u.name!''}---${u.email!''}---${u.nickname!''}</span><br/>
    </#list>
    
    <a href="add">添加用户</a>
</body>
</html>