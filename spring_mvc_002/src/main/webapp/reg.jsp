<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="save">
		<pre>
     ID     : <input type="text" name="id"> 
     Name   : <input type="text" name="name">
     Age    : <input type="number" name="age">
     Email  : <input type="mail" name="mail">
     Gender : <input type="radio" name="gender" value="male" placeholder="male"><label>Male</label>
              <input type="radio" name="gender" value="female" placeholder="female"><label>Female</label>
              <input type="submit">
        </pre>
	</form>

</body>
</html>