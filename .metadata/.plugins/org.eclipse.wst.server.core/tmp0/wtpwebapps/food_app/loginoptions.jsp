<%@ page import="com.org.foodapp.dto.FoodItem" %>
<%@ page import="java.util.List" %>
<%@ page import="com.org.foodapp.dto.User" %>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
   .h1{
   
     display:flex;
     height:15vh;
     justify-content:space-between;
     align-items:center;
     background: linear-gradient(to right,blue,cyan);
     position: relative;
     overflow: hidden;
     
     border-radius: 5px;
     
   }
   .header{
   display:flex;
   justify-content:space-between;
   align-items:center;
 }
 .logo {
      width: 20vh;
      height: 100px;
      position: absolute;
      top: 0;
      left: 0;
    }
 .a{
  text-decoration:none ;
			align-content: center;
			padding: 10px;
			text-align: center;
			margin: 10px auto;
			width: 160px;
			background-color: whitesmoke;
			display: inline-block;
			text-transform: uppercase;
			border-radius: 20px;
 }
 .con{
 width:40vh;
 height:100vh;
 background-color:whitesmoke;
 border: 2px solid cyan;
 }
 .items{
   margin:-103vh 0vh 0vh 39vh ;
   display: flex;
 }
 
 .itemslist{
    width: 40vh;
    height: 50vh;
    overflow: hidden;
    
 }
 .img{
    width: 20vh;
    height: 20vh;
 }
 .container {
    display: flex;
    justify-content: space-around;
    flex-wrap: wrap;
}

.card {
    border: 1px solid #ddd;
    padding: 15px;
    text-align: center;
    margin: 10px;
}
.row{
  display: flex;
  justify-content: space-around;
   flex-wrap: wrap;
   
   
   border: 1px solid #ddd;
    padding: 15px;
    text-align: center;
    margin: 10px;
}
.col-md-4{
   width: 300px;
   height: 400px;
}
.bodycon{
width: 100%;
height: auto;
}
.h2{
  display: inline;
  margin-left: 10px;
  background: linear-gradient(to right,cyan,blue,cyan,blue,cyan);
  border-radius: 2%;
  box-shadow: cyan;
}
a{
  text-decoration: none; 
}
ul{
list-style: none;
}
li{
 margin: 5px 5px 0 -15px;
 
}
 
</style>

</head>
<body>
<header>
<div class="h1">
  <h1 class="h2">VINAYAKA Foods</h1>

<div class="header">
   <a href="Home.jsp" class="a">Home</a>
   <a href="About.jsp" class="a">About</a>
   <a href="fooditems.jsp" class="a">fooditems</a>
   <a href="userdetails.jsp" class="a">user detials</a>
   <a href="logout" class="a">logout</a>
   
</div>
</div>

</header>
<div class="bodycon">
<div class="con">
<div class="con1">
   <a href="components"> allCatogorys</a>
   <ul   >
   <li><a href="veg">Veg</a></li>
   <li><a href="nonveg">Non-Veg</a></li>
   <li><a href="curry">currys</a></li>
   </ul>
</div>
<div class="con2">
  <h1>CART</h1>
  <c:forEach var="item" items="${msg2}">
  <h3><span>${item.itemName}:</span><span>${item.price}</span></h3>
  <h4>Total=${msg3}</h4>
  </c:forEach>
  <h4 >${msg3}</h4>
  <a href="pay">PAY</a>
</div>
</div>
<div class="items">
<%User u=(User)session.getAttribute("msg"); %>

   <div class="container">
        
        <div class="row">
            <c:forEach var="foodItem" items="${foodItems}">
                <div class="col-md-4">
                    <div class="card">
                        <img src="${foodItem.img}" class="card-img-top" alt="Item Image" width="200px" height="200px">
                        <div class="card-body">
                            <h5 class="card-title">${foodItem.itemName}</h5>
                            <p class="card-text">Price: ${foodItem.price}</p>
                            <a href="add?n=${foodItem.id}&userid=${msg1}" class="btn btn-primary">Add to Cart</a>
                        </div>
                    </div>
                </div>
            </c:forEach>
        </div>
    </div>
</div>
</div>


</body>
</html>