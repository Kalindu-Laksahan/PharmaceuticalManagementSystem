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
import classes.dailyRev;

/**
 * Servlet implementation class calRevenue
 */
@WebServlet("/calRevenue")
public class calRevenue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String datez = request.getParameter("date");
		
		try {
			List<dailyRev> Revenue = DBUtill.viewRevenue(datez);
		
			request.setAttribute("Revenue", Revenue);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("DailyRevenue.jsp");
		
		dis.forward(request, response);
		
		
		
		
		

	}

}
