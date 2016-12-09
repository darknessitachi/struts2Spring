<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Sign On</title>
</head>

<body>
<s:form action="login">
    <s:textfield key="userName" label="用户名"/>
    <s:password key="password" label="密　码"/>
    <s:submit/>
</s:form>
</body>
</html>
