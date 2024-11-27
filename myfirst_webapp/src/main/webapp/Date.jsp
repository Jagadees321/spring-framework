<%@ page import="java.util.Date" %>
<%@ page info="today is special day" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <h1><%= new Date() %></h1>
    <h1> <%= getServletInfo() %></h1>

</body>
</html>