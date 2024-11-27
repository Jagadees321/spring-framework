<%@ page import="com.org.dto.Employee" %>
<%@ page import="java.util.List" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <table border="2px">
         <tr>
            <th>Id</th>
            <th>name</th>
            <th>sal</th>
           <td>Edit</td>
           <td>Delete</td>
         </tr>
    <%
       List<Employee> emp=(List<Employee>)session.getAttribute("emp");
       for(Employee e:emp){
    
    %>
      <tr>
           <td><%=e.getId() %></td>
           <td> <%=e.getName() %></td>
           <td><%=e.getSal() %></td>
           <td><a href="edit?id=<%=e.getId() %>">Edit</a></td>
           <td><a href="delete?id=<%=e.getId() %>">Delete</a></td>
          
      </tr>
    <%
    }
    %>
    </table>
    <h1>${msg}</h1>

</body>
</html>