package com.teca5556.eShopping.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.teca5556.eShopping.model.customer_info;

public class CustomerDAOImplementationClass  implements CustomerDAO {
	
	
	private final String url="jdbc:mysql://localhost:3306/teca5556?user=root&password=12345";
	private final String insertCustomerData=
			"insert into Customer_info(customer_name,customer_mobile_number,customer_email_id,customer_password,customer_adress,customer_gender) values(?,?,?,?,?,?)";
	private final String login="select * from Customer_info where (customer_email_id=? or customer_mobile_number=?) and customer_password=?";
	private final String adminLogin="select * from admin where admin_mail_id=?  and admin_password=?";
	public void customerRegistrartion(customer_info customerInfo) {
		// TODO Auto-generated method stub
		try {
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement ps=connection.prepareStatement(insertCustomerData);
			ps.setString(1, customerInfo.getCustomer_name());
			ps.setString(2, customerInfo.getCustomer_mobile_number());
			ps.setString(3, customerInfo.getCustomer_email_id());
			ps.setString(4, customerInfo.getCustomer_password());
			ps.setString(5, customerInfo.getCustomer_Adress());
			ps.setString(6, customerInfo.getCustomer_gender());
			int result=ps.executeUpdate();
			if(result!=0) System.err.println
			("Customer Registration Succesfull....");
			else System.out.println("Invalid Details..");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public customer_info  customerLogin(String customer_email_id, String customer_Password) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement ps=connection.prepareStatement(login);
			ps.setString(1, customer_email_id);
			ps.setString(2, customer_email_id);
			ps.setString(3, customer_Password);
			ResultSet resultset=ps.executeQuery();
			if(resultset.next()) {
				customer_info customerInfo=new customer_info();
				customerInfo.setCustomer_id(resultset.getInt("Customer_id"));
				customerInfo.setCustomer_name(resultset.getString("Customer_name"));
				customerInfo.setCustomer_mobile_number(resultset.getString("Customer_mobile_number"));
				customerInfo.setCustomer_email_id(resultset.getString("Customer_email_id"));
				customerInfo.setCustomer_password(resultset.getString("Customer_password"));
				customerInfo.setCustomer_Adress(resultset.getString("Customer_Adress"));
				customerInfo.setCustomer_gender(resultset.getString("Customer_gender"));
				
				return customerInfo;
				
			}
			else {
				return null;
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	public void adminLogin(String admin_Mail_id, String admin_password) {
		// TODO Auto-generated method stub
		
		try {
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement ps =connection.prepareStatement(adminLogin);
			ps.setString(1, admin_Mail_id);
			ps.setString(2, admin_password);
			ResultSet resultset=ps.executeQuery();
			if(resultset.isBeforeFirst()) System.out.println("Admin Login SuccessFully....");
			else System.err.println("Invalid Cridentials Please Check Detailss");
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
