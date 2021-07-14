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
			<a href="DailyRevenue.jsp"><i class="fa fa-calculator" aria-hidden="true"></i><span>Daily Revenue</span></a><br>
			
				
			</div>
			
			<div class="workspace">
			
			
			<%
			String dr_code = request.getParameter("dr_code");
			String dr_name = request.getParameter("dr_name");
			String dr_brand = request.getParameter("dr_brand");
			String dr_mg = request.getParameter("dr_mg");
			String unit_price = request.getParameter("unit_price");
			String dr_description = request.getParameter("dr_description");
			String dr_catagory = request.getParameter("dr_catagory");
		%>
			
			
			<c:forEach var="updt" items="${updatingDrug}">
			
			<c:set var="dr_code" value="${updt.dr_code}"/>
			<c:set var="dr_name" value="${updt.dr_name}"/>
			<c:set var="dr_brand" value="${updt.dr_brand}"/>
			<c:set var="dr_mg" value="${updt.dr_mg}"/>
			<c:set var="unit_price" value="${updt.unit_price}"/>
			<c:set var="dr_description" value="${updt.dr_description}"/>
			<c:set var="dr_catagory" value="${updt.dr_catagory}"/>
			
			</c:forEach>
			
			
			
			
			
			 <div style = "position:relative; left:80px; top:150px;" class="group" >
			<form action="getDrugServlet" method ="post">
			 <input type="text" name="drCode"  class="form-control  " placeholder="Produc ID" />
			 
			 
			 </form>
			 
			 </div>
			 
			 
			
			    <div style = "position:relative; left:80px; top:150px;" class="group" >
			    <form action ="priceUpdate" method= "post">
			    
			    <input type="text" name="pid"  class="form-control  "  placeholder="Product Name" value="${dr_code}" />
			    <input type="text" name="pname" class="form-control " placeholder="Product Name" value="${dr_name}"required/>
			    <input type="text" name="Qty"  class="form-control  "  placeholder="Quantity"required />
			    <input type="text" name="uprice" class="form-control  " placeholder="Unit Price"   value="${unit_price}" required />
			    

			    <%
			  			    String qty=request.getParameter("Qty");
			  			    String uprice=request.getParameter("uprice");

			  			    int total=0;
			  			    int qtyprice=0;
			  			    if(qty!=null){
			  			    qtyprice=Integer.parseInt(qty);
			  			   // total+=qtyprice;
			  			  //  }
			  			    //if(uprice!=null){
			  			    int upprice=Integer.parseInt(uprice);
			  			    total= (qtyprice * upprice);
			  			    }

			  			    out.print("Total Price  = "+total);
			  			    out.print("    .     ");
			  			   
			  			    %>
			  			
			    
			   
				
			    
			
				<input type="submit" name="AddItem" value="Add Item" /> 
				</form>
				
				</div>
				
		
				
				
				
				<div class="column" style="background-color:;">
				
			    <div style = "position:relative; left:50px; top:150px;" class="Table">
							<table id="tbl">
							
							
							<tr>
									<td>productID</td>
									<td>productName</td>
									<td>Quantity</td>
									<td>Unit price</td>
									<td>Total</td>
							</tr><tr>
							
							
						<c:forEach var="dl" items="${DlDetails}">
						
						
						<c:set var="productID" value="${dl.productID}"/>
						<c:set var="productName" value="${dl.productName}"/>
						<c:set var="qty" value="${dl.qty}"/>
						<c:set var="uPrice" value="${dl.uPrice}"/>
						<c:set var="total" value="${dl.total}"/>
						
				
				
					<td>${dl.productID}</td>

					<td>${dl.productName}</td>
					
				
					<td>${dl.qty}</td>
					
				
					<td>${dl.uPrice}</td>
					
					
				
					<td>${dl.total}</td>
					 
				</tr>
				
				
				</c:forEach>
				</table>
				
				</div>
			    
			    
			    
			    
			  </div>
				
				
				
			  <div style = "position:relative; left:150px; top:400px;" class="group" >	
				<table id="tbl1">
			
			<c:forEach var="stks" items="${Total}">
	
			
		
				<tr>
					<td>Total Value</td>
					<td><b>RS.${stks.tot}</b></td>
				</tr>
				</c:forEach>
			</table> 
			    
				
				</div>
				
				
				
				
				
				
				
				
				
				
				<div style = "position:relative; left:100px; top:450px;" class="group" >
			    <form action ="dashboardS" method ="post" >
			    <input type="hidden" name="date"  class="form-control  " placeholder="Total" value="2020-10-10" />
			   
				
			
				<input type="submit" name="Total" value="Total" > 
				
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