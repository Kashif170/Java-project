package com.handling;

public class ThrowsException {
	 void m1()throws ArithmeticException {
		int a=11;
		int b=0;
		int c=a/b;
		System.out.println(c);
		ArithmeticException t1 = new ArithmeticException();
	}
	 public static void main(String[] args) {
		ThrowsException n = new ThrowsException();
		n.m1();
	}

}
