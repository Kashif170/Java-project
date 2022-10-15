package com.polymorphism;

public class MacBook implements AppleLaptop {

	@Override
	public void start() {
	System.out.println("inside MacBook start");	
	}

	@Override
	public void shutDown() {
		System.out.println("inside MacBook ShutDown");	
	}

}
