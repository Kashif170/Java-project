package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.ConnectionUtil.Connection_Util;
import com.createcoupon.CreateProduct;

public class ProductDao {
 public void save(CreateProduct product) {
	Connection con = Connection_Util.getConnection();
	try {
		PreparedStatement st = con.prepareStatement("insert into productdemo(id,name,description,price)values(?,?,?,?)");
		st.setInt(1, product.getId());
		st.setString(2, product.getName());
		st.setString(3, product.getDescription());
		st.setBigDecimal(4, product.getPrice());
		st.executeUpdate();
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	
}	
	
	
	
	
}
