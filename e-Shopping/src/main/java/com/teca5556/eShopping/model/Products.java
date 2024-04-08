package com.teca5556.eShopping.model;

public class Products {

	private int productid;
	private String productname;
	private double productprice;
	private int productquantity;
	private String productbrand;
	private String productreview;
	private String productcategory;
	
	public Products() {
		
		// TODO Auto-generated constructor stub
	}

	public Products(int productid, String productname, double productprice, int productquantity, String productbrand,
			String productreview, String productcategory) {
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productquantity = productquantity;
		this.productbrand = productbrand;
		this.productreview = productreview;
		this.productcategory = productcategory;
	}

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public double getProductprice() {
		return productprice;
	}

	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}

	public int getProductquantity() {
		return productquantity;
	}

	public void setProductquantity(int productquantity) {
		this.productquantity = productquantity;
	}

	public String getProductbrand() {
		return productbrand;
	}

	public void setProductbrand(String productbrand) {
		this.productbrand = productbrand;
	}

	public String getProductreview() {
		return productreview;
	}

	public void setProductreview(String productreview) {
		this.productreview = productreview;
	}

	public String getProductcategory() {
		return productcategory;
	}

	public void setProductcategory(String productcategory) {
		this.productcategory = productcategory;
	}

	@Override
	public String toString() {
		return "Products [productid=" + productid + ", productname=" + productname + ", productprice=" + productprice
				+ ", productquantity=" + productquantity + ", productbrand=" + productbrand + ", productreview="
				+ productreview + ", productcategory=" + productcategory + "/n]";
	}	
	
}
