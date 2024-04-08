package com.teca5556.eShopping.model;

import com.teca5556.eShopping.DAO.CustomerDAO;
import com.teca5556.eShopping.DAO.CustomerDAOImplementationClass;

public class MobileHC {

	public static CustomerDAO internetHM() {
		
		CustomerDAO customerdao=new CustomerDAOImplementationClass();
		return customerdao;
	}
}
