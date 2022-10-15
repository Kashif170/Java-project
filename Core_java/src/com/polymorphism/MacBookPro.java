package com.polymorphism;

public class MacBookPro extends Object implements AppleLaptop {

	
	@Override
	public void start() {
		System.out.println("inside MacBookPro start");		
	}

	@Override
	public void shutDown() {
		System.out.println("inside MacBookPro ShutDown");
	}

	
}
