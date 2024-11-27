<%@ page import="com.org.dto.Register"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="2px solid cyan">
	     <tr>
	         <th>Id</th>
	         <th>Name</th>
	         <th>Age</th>
	         <th>Email</th>
	         <th>Gender</th>
	         <th>Edit</th>
	         <th>Delete</th>
	     </tr>
	     
	     <% List<Register> li=(List<Register>)session.getAttribute("reg");
	          for(Register e:li){
	     %>
	          <tr>
           <td><%=e.getId() %></td>
           <td> <%=e.getName() %></td>
           <td><%=e.getAge() %></td>
           <td><%=e.getMail() %></td>
           <td><%=e.getGender() %></td>
           
           <td><a href="edit?id=<%=e.getId() %>">Edit</a></td>
           <td><a href="delete?id=<%=e.getId() %>">Delete</a></td>
          
      </tr>
	     
         <%
	          }
         %>

	</table>

</body>
</html>