<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="pink">
<h3>Login Page</h3>
<s:form  action="mainpage">

<s:textfield name="username" label="Enter Username"></s:textfield><br>
<s:password name="password" label="Enter Password"></s:password><br>
<s:submit value="submit"></s:submit>

</s:form>
<a href="newaccount.jsp">New Account</a>

</body>
</html>