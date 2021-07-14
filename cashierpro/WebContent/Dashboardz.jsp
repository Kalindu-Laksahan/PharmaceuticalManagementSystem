<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Isuru Pharmacy Store Keeper Dashboard</title>
		<link rel="stylesheet" href="styles.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css">
		
<style>		
		input[type=text], select {
  width: 10%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}
input[type=number], select {
  width: 10%;
  padding: 12px 20px;
  margin: 8px 0;
  display: inline-block;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
}

input[type=submit] {
  width: 10%;
  background-color: #65666D;
  color: white;
  padding: 14px 20px;
  margin: 8px 0;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

input[type=submit]:hover {
  background-color: #2C2D30;
}
</style>
		
		
		
</head>
<body>
<input type="checkbox" id="nav_animation">
	
	
		<header>
		
			<label for="nav_animation">
			<i class="fas fa-bars" id="sidebar_btn"></i>
			</label>
		
			<div class="company_name">
			<h3>Isuru <span>Pharmacy</span> </h3>
			</div>
			
			<div class="logout">
				<a href="#" class="logout_btn">Logout</a>
			</div>
			
		</header>
			
			<div class="sidenav">
			<center>
				<img src="st1.png" class="user_type" alt="">
				<h4>Cashier</h4>
			</center>
			<a href="Dashboard.jsp"><i class="fa fa-calculator" aria-hidden="true"></i><span>Cashier Dashboard</span></a>
			<a href="Transactions.jsp"><i class="fa fa-info" aria-hidden="true"></i><span>Transaction Details</span></a>
			<a href="DailyRevenue.jsp"><i class="fa fa-money" aria-hidden="true"></i><span>Daily Revenue</span></a><br>
			
				
			</div>
			
			<div class="workspace">
			
			
			
			
			
	
			 <div style = "position:relative; left:80px; top:150px;" class="group" >
			<form action="getDrugServlet" method ="post">
			 <input type="text" name="drCode"  class="form-control  " placeholder="Produc ID" />
			 
			 
			 </form>
			 
			 </div>
			 
			 
			
			    <div style = "position:relative; left:80px; top:150px;" class="group" >
			    <form action =insertValues method= "post">
			    
			    <input type="text" name="pid"  class="form-control  " />
			    <input type="text" name="pname" class="form-control " placeholder="Product Name" />
			    <input type="text" name="Qty"  class="form-control  "  placeholder="Quantity" >
			    <input type="text" name="uprice" class="form-control  " placeholder="Unit Price"   />
			    <input type="text" name="total" class="form-control  " placeholder="total"  />
				
			
				<input type="submit" name="AddItem" value="Add Item" "> 
				</form>
				
				</div>
				
				<div style = "position:relative; left:150px; top:200px;" class="Table">
				<table>
					  <tr>
					    <th>Produc ID</th>
					    <th>Product Name</th>
					    <th>Quantity</th>
					    <th>Unit Price</th>
					    <th>Total</th>
					  </tr>
					  <tr>
					    <td>D113</td>
					    <td>Piriton</td>
					    <td>3</td>
					     <td>20</td>
					    <td>60</td>
					  </tr>
					</table>
				
				</div>
				
				
				
				<div style = "position:relative; left:80px; top:500px;" class="group" >
			    <form action ="#">
			    <input type="text" name="Tot"  class="form-control  " placeholder="Total" />
			    <input type="text" name="Payment" class="form-control " placeholder="Payment" />
			    <input type="text" name="Disc" class="form-control  " placeholder="Discounts" />
			     <input type="text" name="Bal"  class="form-control  " placeholder="Balance" />
				
			
				<input type="submit" name="Proceed" value="Proceed" onclick="myFunction2()"> 
				
				</form>
				</div>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			</div>
			
			<footer>
			<div class="info">
				<h5>Email	IsuruPharmacy@gmail.com<span id="sp1">Address        43/A,</span></h5>
				<h5>Contact No	011 8567890<span id="sp2">New Kandy Road,</span></h5>
				<h5>WhatApp	077 3456766<span id="sp3">Battaramulla</span></h5>
				<h5>Viber	071 5568232</h5>
			</div>
			
			</footer>


</body>
</html>