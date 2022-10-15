package com.overload;

public class DynamicOD {
	
	//int a=10;
	
	void m1(int a,int b) 
	{
		System.out.println("m1");
		System.out.println(a+" "+b);
	}
	
	void m1(float a, int d) 
	{
		System.out.println("m1 is method");
		System.out.println(a+" "+d);
	}
	
	
	
	
	
	public static void main(String[]args) {
		//int a=20;
		
		DynamicOD l= new DynamicOD();
		l.m1(1,5);
		l.m1(10.4f, 65);
System.out.println("all method calling");
}
}