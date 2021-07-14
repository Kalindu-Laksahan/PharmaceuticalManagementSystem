package classes;



import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import java.sql.Connection;


public class DBUtill {
	

	
	
	
	
	
	
public static boolean addtransactions(String tid,String cid,String stotal,String discount,String total,String date) {
		
		boolean success= false;
		
		String jdbcURL = "jdbc:mysql://localhost:3306/isuruphamacydb";
		String dbUser = "root";
		String dbPassword = "kalindu";
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");                    /* creating database connection */
			Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
			Statement stmt= connection.createStatement();
			String sql = "insert into transactions values('"+tid+"','"+cid+"','"+stotal+"','"+discount+"','"+total+"','"+date+"' )";
			int results =stmt.executeUpdate(sql);
			
			
			if(results >0) {
				success =true;
			}
			
			else {
				success =false;
			}
			
		}
		
		catch (Exception e){
			
			e.printStackTrace();
		}
		
		
		return success;
		
		
		}





public static boolean deleteTransaction(String Tid) {
	
	boolean success = false;
	
	String jdbcURL = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String dbUser = "root";
	String dbPassword = "kalindu";
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		Statement stmt= connection.createStatement();
		String sql = "DELETE FROM transactions WHERE TransactionID =('"+Tid+"') ";
		int results =stmt.executeUpdate(sql);
		
		
		if(results >0) {
			success =true;
		}
		
		else {
			success =false;
		}
		
	}
	
	catch (Exception e){
		
		e.printStackTrace();
	}
	
	
	return success;
	
	
}

public static List<Transaction> viewTransactions(){
	
	ArrayList<Transaction> Trlist = new ArrayList<>();

	String url = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String user = "root";
	String pass = "kalindu";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			String query2 = "select * from transactions";

			ResultSet rs= st.executeQuery(query2);

			while(rs.next()) {
			
				String transactionID = rs.getString(1);
				String customerID = rs.getString(2);
				String subTotal = rs.getString(3);
				String discount = rs.getString(4);
				String total = rs.getString(5);
				String date =rs.getString(6);
	
	Transaction s1 = new Transaction(transactionID,customerID,subTotal,discount,total,date);
	Trlist.add(s1);
}


}catch(Exception e) {
e.printStackTrace();
}

return Trlist;

}




public static boolean updateTransactions(String tid,String cid,String stotal,String discount,String total,String date) {
	
	boolean success= false;
	
	String jdbcURL = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String dbUser = "root";
	String dbPassword = "kalindu";
	
	
	try {
		Class.forName("com.mysql.jdbc.Driver");                    /* creating database connection */
		Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
		Statement stmt= connection.createStatement();
		String sql = "UPDATE transactions SET CustomerID=('"+cid+"'),SubTotal=('"+stotal+"'),Discount=('"+discount+"'),Total=('"+total+"'),Date=('"+date+"') WHERE TransactionID =('"+tid+"') ";
		int results =stmt.executeUpdate(sql);
		
		
		if(results >0) {
			success =true;
		}
		
		else {
			success =false;
		}
		
	}
	
	catch (Exception e){
		
		e.printStackTrace();
	}
	
	
	return success;
	
	
	}

public static List<Transaction> viewTransactionTable(){
	
	ArrayList<Transaction> Trlist = new ArrayList<>();

	String url = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String user = "root";
	String pass = "kalindu";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			String query2 = "select * from transactions";

			ResultSet rs= st.executeQuery(query2);

			while(rs.next()) {
			
				String transactionID = rs.getString(1);
				String customerID = rs.getString(2);
				String subTotal = rs.getString(3);
				String discount = rs.getString(4);
				String total = rs.getString(5);
				String date =rs.getString(6);
	
	Transaction s1 = new Transaction(transactionID,customerID,subTotal,discount,total,date);
	Trlist.add(s1);
}


}catch(Exception e) {
e.printStackTrace();
}

return Trlist;

}


public static List<drugs> getDrugkDetails(int drug_code){
	
	ArrayList<drugs> updatingDrug = new ArrayList<>();

	String url = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String user = "root";
	String pass = "kalindu";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			String query3 = "select * from drugs where dr_code='"+drug_code+"'";

			ResultSet rs= st.executeQuery(query3);

			while(rs.next()) {
				int dr_code = rs.getInt(1);
				String dr_name = rs.getString(2);
				String dr_brand= rs.getString(3);
				String dr_mg = rs.getString(4);
				int unit_price = rs.getInt(5);
				String dr_description = rs.getString(6);
				String dr_catagory = rs.getString(7);
	
	drugs s2 = new drugs(dr_code,dr_name,dr_brand,dr_mg,unit_price,dr_description,dr_catagory);
	updatingDrug.add(s2);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

		return updatingDrug;

}




public static boolean UpdateItems(String productID,String productName, String qty, String uPrice,String total) {
	
	String url = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String user = "root";
	String pass = "kalindu";
	
	boolean status=false;
	int upd;
	
	try {
		
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, user, pass);
		Statement st = con.createStatement();
		
		
			String query4 = "insert into deals values('"+productID+"','"+productName+"','"+qty+"','"+uPrice+"','"+total+"' )";
			
			upd=st.executeUpdate(query4);
			
			if(upd > 0) {
				status=true;
			}
			else {
				status=false;
			}
		
		
		
	}catch(Exception ex) {
		ex.printStackTrace();
	}
			
	
	return status;
}




public static List<deals> viewDealsTable(){
	
	ArrayList<deals> Deallist = new ArrayList<>();

	String url = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String user = "root";
	String pass = "kalindu";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			String query2 = "select * from deals";

			ResultSet rs= st.executeQuery(query2);

			while(rs.next()) {
			
				String productID = rs.getString(1);
				String productName = rs.getString(2);
				String qty = rs.getString(3);
				String uPrice = rs.getString(4);
				String total = rs.getString(5);
	
	deals s7 = new deals(productID,productName,qty,uPrice,total);
	Deallist.add(s7);
}


}catch(Exception e) {
e.printStackTrace();
}

return Deallist;

}

// View daily revenue of given date
public static List<dailyRev> viewRevenue(String datez){
	
	ArrayList<dailyRev> Rlist = new ArrayList<>();

	String url = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String user = "root";
	String pass = "kalindu";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			String query2 = "select Sum(Total) from transactions where Date='"+datez+"'";

			ResultSet rs= st.executeQuery(query2);

			while(rs.next()) {
				
				String tot =rs.getString(1);
				
	
	dailyRev s1 = new dailyRev(tot);
	Rlist.add(s1);
}


}catch(Exception e) {
e.printStackTrace();
}

return Rlist;

}




//View total of deals table
public static List<getTotal> viewTotal(){
	
	ArrayList<getTotal> Rlist = new ArrayList<>();

	String url = "jdbc:mysql://localhost:3306/isuruphamacydb";
	String user = "root";
	String pass = "kalindu";

		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection con = DriverManager.getConnection(url, user, pass);
			Statement st = con.createStatement();

			String query2 = "select Sum(Total) from deals";

			ResultSet rs= st.executeQuery(query2);

			while(rs.next()) {
				
				String tot =rs.getString(1);
				
	
	getTotal s1 = new getTotal(tot);
	Rlist.add(s1);
}


}catch(Exception e) {
e.printStackTrace();
}

return Rlist;

}











	
	

}

