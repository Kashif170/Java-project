package com.encapsulation;

public class SuperT {
	
	
 int a=10;
 
 class ThisT extends SuperT{
	 
	int a=30;
 }
 
 
	
	void  m1() {
		int a = 20;
		System.out.println(a);
		System.out.println(a);
	}

	public static void main(String[] args) {
		
SuperT s = new SuperT();
s.m1();
	}

}

