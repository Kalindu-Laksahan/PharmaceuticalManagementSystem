package classes;

public class deals {
	
	private String productID;
	private String productName;
	private String qty;
	private String uPrice;
	private String total;
	
	public deals(String productID, String productName, String qty, String uPrice, String total) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.qty = qty;
		this.uPrice = uPrice;
		this.total = total;
	}

	public String getProductID() {
		return productID;
	}

	public String getProductName() {
		return productName;
	}

	public String getQty() {
		return qty;
	}

	public String getuPrice() {
		return uPrice;
	}

	public String getTotal() {
		return total;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public void setQty(String qty) {
		this.qty = qty;
	}

	public void setuPrice(String uPrice) {
		this.uPrice = uPrice;
	}

	public void setTotal(String total) {
		this.total = total;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
