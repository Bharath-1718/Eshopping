package com.teca5556.eShopping.DAO;

import com.teca5556.eShopping.model.customer_info;

public interface CustomerDAO {

	void customerRegistrartion(customer_info customerInfo);
	
	customer_info customerLogin(String customer_email_id,String customer_Password);
	
	void adminLogin(String admin_Mail_id,String admin_password);
}

