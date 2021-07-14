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
 * Servlet implementation class DeleteTransactionS
 */
@WebServlet("/DeleteTransactionS")
public class DeleteTransactionS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
	String Tid= request.getParameter("tid");
		
		
		boolean dlt;
		
		dlt =	DBUtill.deleteTransaction(Tid);
		
		if(dlt == true) {
			
			RequestDispatcher dis =request.getRequestDispatcher("TrViewServlet");
			dis.forward(request, response);
			}
		else {
			RequestDispatcher dis1= request.getRequestDispatcher("unsuccess.jsp");
			dis1.forward(request, response);
		}
	}

}
