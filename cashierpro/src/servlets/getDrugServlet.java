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
import classes.drugs;

/**
 * Servlet implementation class getDrugServlet
 */
@WebServlet("/getDrugServlet")
public class getDrugServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
int drug_code = Integer.parseInt(request.getParameter("drCode"));
		
		try {
			List<drugs> updatingDrug = DBUtill.getDrugkDetails(drug_code);
		
			request.setAttribute("updatingDrug", updatingDrug);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("Dashboard.jsp");
		
		dis.forward(request, response);
		
		
	}

}
