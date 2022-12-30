package com.Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ConnectionUtil.Connection_Util;
import com.createcoupon.module.Coupon;

public  class CouponDoa implements CouponDao {

	

	public void save(Coupon cp) {
	
		Connection con = Connection_Util.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("insert into products(coupon_code,Discount,ExpDate)values(?,?,?)");
			//st.setInt(1, cp.getId());
			st.setString(1, cp.getCoupon_code());
			st.setBigDecimal(2, cp.getDiscount());
			st.setString(3, cp.getExpDate());
			
			st.executeUpdate();
		} catch (Exception e) {
			
		}
	}

	@Override
	public Coupon findByCode(String code) {
		Coupon cp = new Coupon();
		Connection con = Connection_Util.getConnection();
		try {
			PreparedStatement st = con.prepareStatement("select * from products where coupon_code=?");
					 
			st.setString(1,code );
			
			
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				cp.setId(rs.getInt(1));
				cp.setCoupon_code(rs.getString(2));
				cp.setDiscount(rs.getBigDecimal(3));
				cp.setExpDate(rs.getString(4));
				
			}
		} catch (Exception e) {
			
		}
	
		return cp;
		
		
	}

	
		
	}


