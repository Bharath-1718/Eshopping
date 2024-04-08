package com.teca5556.eShopping.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.teca5556.eShopping.model.Products;


public class ProductDAOImplemntation implements ProductDAO  {

	private final String url="jdbc:mysql://localhost:3306/teca5556?user=root&password=12345";
	private final String selectProductDetails="select * from products";
	List<Products> listOfProducts=new ArrayList<Products>();
	public List<Products> getAllProductDetails() {
		// TODO Auto-generated method stub
		try {
			Connection connection=DriverManager.getConnection(url);
			PreparedStatement ps=connection.prepareStatement(selectProductDetails);
			ResultSet resultset=ps.executeQuery();
			
			if(resultset.isBeforeFirst()) {
				while(resultset.next()) {
					Products products=new Products();
					products.setProductid(resultset.getInt("Product_Id"));
					products.setProductname(resultset.getString("Product_Name"));
					products.setProductprice(resultset.getDouble("Product_Price"));
					products.setProductquantity(resultset.getInt("Product_Quantity"));
					products.setProductbrand(resultset.getString("Product_Brand"));
					products.setProductreview(resultset.getString("Product_Review"));
					products.setProductcategory(resultset.getString("Product_Quantity"));
					
					listOfProducts.add(products);
				}
				return listOfProducts;
			}
			else return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return null;
		
	}

}
