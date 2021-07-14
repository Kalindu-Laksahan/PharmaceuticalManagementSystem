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
			<a href="DailyRevenue.jsp"><i class="fa fa-calculator" aria-hidden="true"></i><span>Daily Revenue</span></a><br>
			
				
			</div>
			
			<div class="workspace">
			
			
			
			  <div style = "position:relative; left:150px; top:200px;" class="Table">
				<table id="tbl">
				
				<tr>
						<td>TransactionID</td>
						<td>CustomerID</td>
						<td>SubTotal</td>
						<td>Discount%</td>
						<td>Total</td>
						<td>Date</td>
				</tr><tr>
			<c:forEach var="trans" items="${TrDetails}">
			
			
			<c:set var="transactionID" value="${trans.transactionID}"/>
			<c:set var="customerID" value="${trans.customerID}"/>
			<c:set var="subTotal" value="${trans.subTotal}"/>
			<c:set var="discount" value="${trans.discount}"/>
			<c:set var="total" value="${trans.total}"/>
			<c:set var="date" value="${trans.date}"/>
			
		<td>${trans.transactionID}</td>

		<td>${trans.customerID}</td>
		
	
		<td>${trans.subTotal}</td>
		
	
		<td>${trans.discount}</td>
		
		
	
		<td>${trans.total}</td>
		
		<td>${trans.date}</td>
		 
	</tr>
	
	
	</c:forEach>
	</table>
	
	</div>
	<br><br><br><br>
	
	
	
	<div style = "position:relative; left:150px; top:300px;" class="group" >
			    <form action ="UpdateServlet" method ="post">
			    <input type="text" name="transactionID"  class="form-control  " placeholder="Transaction ID" required/>
			    <input type="text" name="customerID"  class="form-control  " placeholder="Customer ID" required />
			    <input type="text" name="subTotal"  class="form-control  " placeholder="Sub Total"required />
			    <input type="text" name="discount" class="form-control " placeholder="Discount (%)" required/>
			   <input type="date" name="date" class="form-control " placeholder="Date"required />
				
			
				<input type="submit" name="Proceed" value="Update" onclick="myFunction2()"> 
				
				</form>
				</div>
	
	
	 <div style = "position:relative; left:150px; top:150px;" class="group" >
			   
			
			
			
			
			
			    <form action="TrTableView" method="post">
				<input type="submit" name="submit" value="Show table">
				</form>
				
				
				
				
				</div>
				
			<div style = "position:relative; left:150px; top:350px;" class="group" >	
				<table id="tbl1">
			
			<c:forEach var="stks" items="${Revenue}">
	
			
		
				<tr>
					<td><b>Profit Of The Day</b></td>
					<td><b>${stks.tot}</b></td>
				</tr>
				</c:forEach>
			</table> 
			    
				<form action="calRevenue" method ="post">
			    <input type="date" name="date" class="form-control " placeholder="" required/>
			    <input type="submit" name="submit" value="Daily Revenue">
				</form>
				
				
				</div>
				
				
				
				
				
				
				
				
				

			
			
	<script>
function myFunction2() {
  alert("Data Successfully Updated ");
}

</script>			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
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
</html>tml>