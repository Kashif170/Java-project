package com.inheritence;

public class Childb extends TestA {

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		System.out.println("C");
	}
		// TODO Auto-generated method stub
		
	

	@Override
	public void m5() {
		System.out.println("D");
		// TODO Auto-generated method stub
		
		
		
	}
	public static void main(String[]args) {
		
		TestA b = new Childb();
		b.m4();
		b.m5();
		
		
		
		
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

}
