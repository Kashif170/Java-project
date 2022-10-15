package com.polymorphism;

public class RuntimeBinding {

	public static void main(String[] args) {
		
		AppleLaptop m1 = new MacBookPro();
		AppleLaptop m2 = new MacBook();
m1.start();
m1.shutDown();

m2.start();
m2.shutDown();
	}

}
