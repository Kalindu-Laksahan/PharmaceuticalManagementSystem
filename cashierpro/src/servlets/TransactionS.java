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
 * Servlet implementation class TransactionS
 */
@WebServlet("/TransactionS")
public class TransactionS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String tid= request.getParameter("transactionID");
		String cid= request.getParameter("customerID");
		String stotal = request.getParameter("subTotal");
		String discount = request.getParameter("discount");
	//	String total = request.getParameter("total");
		int Sub=Integer.parseInt(stotal);
		int Dis=Integer.parseInt(discount);
		int tot= Sub-(Sub*Dis/100);
		
		String total=String.valueOf(tot);
		String date = request.getParameter("date");
		
boolean output;
		
		output = DBUtill.addtransactions(tid, cid, stotal , discount,total,date);
		
		if(output == true) {
			
			RequestDispatcher dis =request.getRequestDispatcher("TrViewServlet");
			dis.forward(request, response);
			
			}
		else {
			RequestDispatcher dis1= request.getRequestDispatcher("unsuccess.jsp");
			dis1.forward(request, response);
		}
		
		
		
		
		
		
	}

}
