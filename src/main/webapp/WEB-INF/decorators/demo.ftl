<#import "../ftl/include/spring.ftl" as spring/>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>系统-${title}</title>
    ${head}
</head>
<body>
	<h1><@spring.message "hello"/></h1>
    ${body}
</body>
</html>