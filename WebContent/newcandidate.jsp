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
<h3>New Election</h3>
<s:form action="newcandidate">
<s:textfield name="id" label="Add Id"></s:textfield><br>
<s:textfield name="eid" label="Add Election Id"></s:textfield><br>
<s:textfield name="topic" label="Enter Topic"></s:textfield><br>
<s:textfield name="name" label="Enter Name"></s:textfield><br>
<s:textfield name="address" label=" Enter Address"></s:textfield><br>
<s:textfield name="mobile" label="Enter Mobile"></s:textfield><br>
<s:submit value="submit"></s:submit>


</s:form>


</body>
</html>