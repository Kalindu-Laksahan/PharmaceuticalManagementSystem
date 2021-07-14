package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.DBUtill;
/**
 * Servlet implementation class priceUpdate
 */
@WebServlet("/priceUpdate")
public class priceupdate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	
		String productId = request.getParameter("pid");
		String productName = request.getParameter("pname");
		String qty = request.getParameter("Qty");
		String uPrice = request.getParameter("uprice");
		//String total =request.getParameter("total");
		
		int quantity=Integer.parseInt(qty);
		int unitp=Integer.parseInt(uPrice);
		int tot= quantity*unitp;
		
		String total=String.valueOf(tot); 
		
boolean output;
		
		output = DBUtill.UpdateItems(productId,productName,qty,uPrice,total);
		
		if(output == true) {
			
			RequestDispatcher dis =request.getRequestDispatcher("dealsView");
			dis.forward(request, response);
			
			}
		else {
			RequestDispatcher dis1= request.getRequestDispatcher("Dashboard.jsp");
			dis1.forward(request, response);
		}
		 
		
		
		
	}

}
