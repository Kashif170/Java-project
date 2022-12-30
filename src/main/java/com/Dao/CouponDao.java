package com.Dao;

import java.sql.Connection;

import com.createcoupon.module.Coupon;

public interface CouponDao {

	public void save(Coupon cp);
	Coupon findByCode(String code);
}
