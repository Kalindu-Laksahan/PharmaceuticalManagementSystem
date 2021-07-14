package classes;

public class drugs {

	private int dr_code ;
	private String dr_name;
	private String dr_brand;
	private String dr_mg;
	private int unit_price;
	private String dr_description;
	private String dr_catagory;
	
	public drugs(int dr_code, String dr_name, String dr_brand, String dr_mg, int unit_price, String dr_description,
			String dr_catagory) {
		super();
		this.dr_code = dr_code;
		this.dr_name = dr_name;
		this.dr_brand = dr_brand;
		this.dr_mg = dr_mg;
		this.unit_price = unit_price;
		this.dr_description = dr_description;
		this.dr_catagory = dr_catagory;
	}

	public int getDr_code() {
		return dr_code;
	}

	public String getDr_name() {
		return dr_name;
	}

	public String getDr_brand() {
		return dr_brand;
	}

	public String getDr_mg() {
		return dr_mg;
	}

	public int getUnit_price() {
		return unit_price;
	}

	public String getDr_description() {
		return dr_description;
	}

	public String getDr_catagory() {
		return dr_catagory;
	}

	public void setDr_code(int dr_code) {
		this.dr_code = dr_code;
	}

	public void setDr_name(String dr_name) {
		this.dr_name = dr_name;
	}

	public void setDr_brand(String dr_brand) {
		this.dr_brand = dr_brand;
	}

	public void setDr_mg(String dr_mg) {
		this.dr_mg = dr_mg;
	}

	public void setUnit_price(int unit_price) {
		this.unit_price = unit_price;
	}

	public void setDr_description(String dr_description) {
		this.dr_description = dr_description;
	}

	public void setDr_catagory(String dr_catagory) {
		this.dr_catagory = dr_catagory;
	}
	

	
}