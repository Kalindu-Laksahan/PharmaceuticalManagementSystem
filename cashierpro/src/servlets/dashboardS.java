package servlets;

import java.awt.event.KeyEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import classes.DBUtill;
import classes.getTotal;

/**
 * Servlet implementation class dashboardS
 */
@WebServlet("/dashboardS")
public class dashboardS extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//String datez = request.getParameter("date");
		
		try {
			List<getTotal> Total = DBUtill.viewTotal();
		
			request.setAttribute("Total", Total);
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("Dashboard.jsp");
		
		dis.forward(request, response);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
