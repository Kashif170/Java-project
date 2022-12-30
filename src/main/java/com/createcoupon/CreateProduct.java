package com.createcoupon;

import java.math.BigDecimal;

public class CreateProduct {

	private int id;
	private  String name;
	private String  description;
	private BigDecimal price;
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "CreateProduct [id=" + id + ", name=" + name + ", description=" + description + ", price=" + price + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
}
