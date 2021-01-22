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
<s:form action="voteregister">
<s:textfield name="voteid" label="Enter Voter Id "></s:textfield><br>
<s:textfield name="name" label="Enter Name"></s:textfield><br>
<s:submit value="submit"></s:submit>

</s:form>

</body>
</html>