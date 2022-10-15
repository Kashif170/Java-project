package com.inheritence.interfaceTest;

import com.inheritence.Parent1;

public class Test extends Parent1 {
	final static int a;
	static {
		a=30;
		
	}
	void m1() {
		System.out.println("in m1()");
	}
public static void main(String[] args) {
	Test p = new Test();
	Interface2 i = new InterfaceImplement();
	i.m1();
	i.m2();
}
}
