package com.teca5556.eShopping;

import java.util.List;
import java.util.Scanner;

import com.teca5556.eShopping.DAO.CustomerDAO;
import com.teca5556.eShopping.DAO.ProductDAO;
import com.teca5556.eShopping.DAO.ProductDAOImplemntation;
import com.teca5556.eShopping.model.MobileHC;
import com.teca5556.eShopping.model.Products;
import com.teca5556.eShopping.model.customer_info;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
      CustomerDAO customerDAO=MobileHC.internetHM();
      ProductDAO productDAO=new ProductDAOImplemntation();
     System.out.println("Welcome To Teca5556 e-shopping Application..");
     System.out.println("***********************************************");
//     String email;
//     String password;
     boolean condition=true;
     while(condition) {
     System.out.println("Choose Your Option..");
     System.out.println("Enter 1 For Registeration.");
     System.out.println("Enter 2 for Login..");
     System.out.println("Enter 3 For Admin Login");
     int input=sc.nextInt();
     switch (input) {
	case 1:{
		  System.out.println("Enter The Name Of The Customer.");
	      String name=sc.next();
	      System.out.println("Enter The Mobile Number");
	      String mobileNumber=sc.next();
	      while(mobileNumber.length()!=10) {
	    	  System.out.println("Enter The Mobile Number");
	    	  mobileNumber=sc.next();
	      }
	      System.out.println("Enter The Email id Of Customer");
	     String  email=sc.next();
	      System.out.println("Enter The Password..");
	       String password=sc.next();
	      while(password.length()<4) {
	    	 System.out.println("Enter THE Password");
	    	 password=sc.next();
	      }
	      System.out.println("Enter The Adress OF Customer..");
	      String adress=sc.next();
	      System.out.println("enter Your Gender..");
	      String gender=sc.next();
	      customer_info customerInfo=new customer_info();
	      customerInfo.setCustomer_name(name);
	      customerInfo.setCustomer_mobile_number(mobileNumber);
	      customerInfo.setCustomer_email_id(email);
	      customerInfo.setCustomer_password(password);
	      customerInfo.setCustomer_Adress(adress);
	      customerInfo.setCustomer_gender(gender);
	      customerDAO.customerRegistrartion(customerInfo);

	}
		break;
		
	case 2:{
		System.out.println("Welcome To The Login Page....");
	
		System.out.println("Enter Your Email id Or Password...");
		String loginEmail=sc.next();
		System.out.println("Enter The Password");
		String loginPassword=sc.next();
		customer_info customerlogin=customerDAO.customerLogin(loginEmail, loginPassword);
		//System.out.println(customerlogin);
		if(customerlogin != null) {
			if(customerlogin.getCustomer_gender().equalsIgnoreCase("Male"))
				{
					System.out.println("Hello Mr "+customerlogin.getCustomer_name());
					
				}
			else if(customerlogin.getCustomer_gender().equalsIgnoreCase("Female"))
			{
					
				System.out.println("Hello Mrs "+customerlogin.getCustomer_name());
			}
			else {
				System.err.println("No results Found...");
			}
			
			System.out.println("Choose Your Opertaionn....");
			System.out.println("Enter 1 For Product Detailss...");
			System.out.println("Enter 2 For Cart Details..");
			int loginOptions=sc.nextInt();
			switch (loginOptions) {
			case 1: {
						System.err.println("Product Details Are....");
						List <Products> allproductDetails=productDAO.getAllProductDetails();
						//System.out.println(allproductDetails);
						int count=0;
						for (Products products : allproductDetails) {
							count++;
							System.out.println("S.No :- "+count);
							System.out.println("Product Name  : "+products.getProductname());
							System.out.println("Product Price : "+products.getProductprice());
							System.out.println("**---**---**---**---**---");
							
						}
						
			}
				break;
			case 2:{
				System.out.println("Cart Details..");
			}
			break;
				
				

			default:
				break;
			}
		}
		else {
			System.out.println("No Results Found Invaliod Login....");
		}
		
		break;
	 }
	case 3:{
		System.out.println("Welcome To Admin Login Page..");
		System.out.println("Enter The Admin Email");
		String adminmail=sc.next();
		System.out.println("enter The admin password");
		String adminPassword=sc.next();
		customerDAO.adminLogin(adminmail, adminPassword);
		
	}
		break;
	default:
		break;
	}
     
     System.out.println("Do You Want To Continue..");
     System.out.println("yes- if you want to continue");
     System.out.println("No - To exit");
     String inputs=sc.next();
     if(inputs.equalsIgnoreCase("yes")) continue;
     else condition=false;
    }
     	System.out.println("Thank Youuu...");
    }
    
}
