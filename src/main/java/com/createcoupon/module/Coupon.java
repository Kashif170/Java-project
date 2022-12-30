package com.createcoupon.module;

import java.math.BigDecimal;

public class Coupon {
private int id;
private String coupon_code;
private BigDecimal Discount;
private String ExpDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCoupon_code() {
	return coupon_code;
}
public void setCoupon_code(String coupon_code) {
	this.coupon_code = coupon_code;
}
@Override
public String toString() {
	return "Coupon [id=" + id + ", coupon_code=" + coupon_code + ", Discount=" + Discount + ", ExpDate=" + ExpDate
			+ "]";
}
public BigDecimal getDiscount() {
	return Discount;
}
public void setDiscount(BigDecimal discount) {
	Discount = discount;
}
public String getExpDate() {
	return ExpDate;
}
public void setExpDate(String expDate) {
	ExpDate = expDate;
}
}
