package com.teca5556.eShopping.model;

public class Admin {

	private int admin_id;
	private String admin_Name;
	private String admin_email_id;
	private String admin_password;
	
	public Admin() {
		
		// TODO Auto-generated constructor stub
	}

	public Admin(int admin_id, String admin_Name, String admin_email_id, String admin_password) {
		this.admin_id = admin_id;
		this.admin_Name = admin_Name;
		this.admin_email_id = admin_email_id;
		this.admin_password = admin_password;
	}

	public int getAdmin_id() {
		return admin_id;
	}

	public void setAdmin_id(int admin_id) {
		this.admin_id = admin_id;
	}

	public String getAdmin_Name() {
		return admin_Name;
	}

	public void setAdmin_Name(String admin_Name) {
		this.admin_Name = admin_Name;
	}

	public String getAdmin_email_id() {
		return admin_email_id;
	}

	public void setAdmin_email_id(String admin_email_id) {
		this.admin_email_id = admin_email_id;
	}

	public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}
	
	
	
}
