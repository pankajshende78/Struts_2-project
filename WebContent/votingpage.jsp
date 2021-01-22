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

 
 <s:form action="finalvote">
 
 
  <s:radio list="{'Candidate : 1','Candidate 2','Candidate 3'}" name="vote" ></s:radio><br>
  <s:submit value="Vote"></s:submit>
 

</s:form>
<a href="candidatedata.jsp">Candidate Data</a>
<br><br>
<a href="givevote.jsp"></a>


</body>
</html>