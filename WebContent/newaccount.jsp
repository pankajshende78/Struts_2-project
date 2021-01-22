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
<h3>Register Here</h3>
<s:form action="newaccount">

<s:textfield name="username" label="Enter Username"></s:textfield><br>
<s:textfield name="password" label="Enter Password"></s:textfield><br>
<s:textfield name="repassword" label="Enter Re-password"></s:textfield><br>
<s:submit value="submit"></s:submit>
</s:form>

<a href="index.jsp">Back</a>
</body>
</html>