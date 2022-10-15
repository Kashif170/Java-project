package com.encapsulation;

public class Test {
public static void main(String[] args) {
	Customer c = new Customer();
	c.setFirstName(null);
	c.setLastName("chaudhry");
	c.setCreditCard("12345");
	System.out.println(c.getCreditCard());
	System.out.println(c.getFirstName());
	System.out.println(c.getLastName());
}
}
