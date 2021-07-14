package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import classes.DBUtill;
import classes.Transaction;



/**
 * Servlet implementation class TrViewServlet
 */
@WebServlet("/TrViewServlet")
public class TrViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		try {
			List<Transaction> TransactionDetails = DBUtill.viewTransactions();
		
			request.setAttribute("TrDetails", TransactionDetails);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("Transactions.jsp");
		
		dis.forward(request, response);
		
		
		
		
	}

}
