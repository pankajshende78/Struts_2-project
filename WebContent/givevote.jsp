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

<s:form action="checkvoteid">

<s:textfield name="voteid" label=" Please Enter Your Voter Id"></s:textfield><br>
<s:submit value="submit"></s:submit>


</s:form>

<a href="user.jsp">Back</a>
</body>
</html>