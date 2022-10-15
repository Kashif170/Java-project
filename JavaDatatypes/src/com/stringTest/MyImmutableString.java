package com.stringTest;

public class MyImmutableString {
	int x;
	MyImmutableString(int x){
		this.x=x;
	}
	public MyImmutableString change(int x) {
		if(this.x==x) {
			return this;
		}else {
			return new MyImmutableString(x);
		}
	}
	public static void main(String[] args) {
		MyImmutableString m1 = new MyImmutableString(20);
		MyImmutableString m2 = m1.change(20);
		System.out.println(m1==m2);
		MyImmutableString m3 = m2.change(30);
		System.out.println(m3==m2);
	}
}
	

