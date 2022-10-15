package com.inheritence;

public class ChildAMultiple implements MultipleP {

	@Override
	public void m1(int a, int b) {
		System.out.println(a+b);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2(float a, float b) {
		// TODO Auto-generated method stub
	System.out.println(a*b);	
	}

	@Override
	public void m3(String name) {
		System.out.println("The King is back");
		// TODO Auto-generated method stub
		
	}

}
