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
    
       public String evenorOdd(int n){
    	if(n%2==0) {
    		return "even";
         }
    	else{
    		return "odd";
    	}
    	
    	
    	
    }
    
    public static int a(int k){
		return k;
	}
    %>
    <%
        int n=Integer.parseInt(request.getParameter("n"));


        	
        
    %>
     <h1>Num is : <%= a(n) %></h1> 
   <h1>It is  <%= evenorOdd(n) %> Number</h1>
   
 
   
    

</body>
</html>