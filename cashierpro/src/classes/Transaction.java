package classes;

public class Transaction {
	
	private String TransactionID;
	private String CustomerID;
	private String SubTotal;
	private String Discount;
	private String Total;
	private String Date;
	
	public Transaction(String transactionID, String customerID, String subTotal, String discount, String total,String date) {
		super();
		TransactionID = transactionID;
		CustomerID = customerID;
		SubTotal = subTotal;
		Discount = discount;
		Total = total;
		Date=date;
	}

	public String getTransactionID() {
		return TransactionID;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public String getSubTotal() {
		return SubTotal;
	}

	public String getDiscount() {
		return Discount;
	}

	public String getTotal() {
		return Total;
	}

	public void setTransactionID(String transactionID) {
		TransactionID = transactionID;
	}

	public void setCustomerID(String customerID) {
		CustomerID = customerID;
	}

	public void setSubTotal(String subTotal) {
		SubTotal = subTotal;
	}

	public void setDiscount(String discount) {
		Discount = discount;
	}

	public void setTotal(String total) {
		Total = total;
	}
	public String getDate() {
		return Date;
	}

	public void setDate(String date) {
		Date = date;
	}
	
	
	
	

	
	
	
	

}
