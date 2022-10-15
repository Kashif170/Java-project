package com.oops.Abstraction;

public class ThisExample {
	int a;
	int b;
	void m1(int a,int b) {
		this.a=a;
		this.b=b;
	}

public static void main(String[] args) {
	ThisExample t = new ThisExample();
	System.out.println(t.a+" "+t.b);
	t.m1(10, 20);
	System.out.println(t.a+" "+t.b);
}
}
