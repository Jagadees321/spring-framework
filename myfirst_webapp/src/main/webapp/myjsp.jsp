<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <%! 
       static{
    	 System.out.println("i am static jsp");
     }
     {
    	 System.out.println("i am nonstatic jsp");
     }
     %>
     <%
          System.out.println("i am service block jsp");
          int i=7;
     %>
     <h1> <%= i %> </h1>

</body>
</html>