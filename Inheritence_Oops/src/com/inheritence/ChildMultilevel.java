package com.inheritence;

public class ChildMultilevel extends ParentMultilevel{
public static void main(String[] args) {
	Multilevel1 l = new ParentMultilevel();
	l.k1();
	Multilevel1 s = new ChildMultilevel();
	l.k3();
	l.k2();
	System.out.println("Call parent ");
}
}
