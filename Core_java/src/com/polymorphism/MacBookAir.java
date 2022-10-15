package com.polymorphism;

public class MacBookAir extends MacBook {

	@Override
	void start() {
		System.out.println("inside MacBookAir start");
	}

	@Override
	void shutDown() {
		System.out.println("inside MacBookAir shutDown");
	}

}
