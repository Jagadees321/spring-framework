<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib prefix="abc"  uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <abc:form action="update" modelAttribute="emp">
      <pre>
      ID :  <abc:input path="id"/>
      Name: <abc:input path="name"/>
      Sal:  <abc:input path="sal"/>
          <abc:button>Update</abc:button>
      </pre>
      
      </abc:form>

</body>
</html>