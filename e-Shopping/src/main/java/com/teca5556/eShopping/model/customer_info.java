package com.teca5556.eShopping.model;

public class customer_info {
	
	private int customer_id;
	private String customer_name;
	private String customer_mobile_number;
	private String customer_email_id;
	private String customer_password;
	private String customer_Adress;
	private String customer_gender;
	
	public customer_info(int customer_id, String customer_name, String customer_mobile_number, String customer_email_id,
			String customer_password, String customer_Adress, String customer_gender) {
	
		this.customer_id = customer_id;
		this.customer_name = customer_name;
		this.customer_mobile_number = customer_mobile_number;
		this.customer_email_id = customer_email_id;
		this.customer_password = customer_password;
		this.customer_Adress = customer_Adress;
		this.customer_gender = customer_gender;
	}
	
	public customer_info() {
		
		// TODO Auto-generated constructor stub
	}

	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getCustomer_name() {
		return customer_name;
	}
	public void setCustomer_name(String customer_name) {
		this.customer_name = customer_name;
	}
	public String getCustomer_mobile_number() {
		return customer_mobile_number;
	}
	public void setCustomer_mobile_number(String customer_mobile_number) {
		this.customer_mobile_number = customer_mobile_number;
	}
	public String getCustomer_email_id() {
		return customer_email_id;
	}
	public void setCustomer_email_id(String customer_email_id) {
		this.customer_email_id = customer_email_id;
	}
	public String getCustomer_password() {
		return customer_password;
	}
	public void setCustomer_password(String customer_password) {
		this.customer_password = customer_password;
	}
	public String getCustomer_Adress() {
		return customer_Adress;
	}
	public void setCustomer_Adress(String customer_Adress) {
		this.customer_Adress = customer_Adress;
	}
	public String getCustomer_gender() {
		return customer_gender;
	}
	public void setCustomer_gender(String customer_gender) {
		this.customer_gender = customer_gender;
	}

	@Override
	public String toString() {
		return "customer_info [customer_id=" + customer_id + ", customer_name=" + customer_name
				+ ", customer_mobile_number=" + customer_mobile_number + ", customer_email_id=" + customer_email_id
				+ ", customer_password=" + customer_password + ", customer_Adress=" + customer_Adress
				+ ", customer_gender=" + customer_gender + "]";
	}

	
}
