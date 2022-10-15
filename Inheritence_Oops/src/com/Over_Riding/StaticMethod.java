package com.Over_Riding;

public class StaticMethod {
	String s ="abc";
	 StaticMethod  m1() {
	System.out.println(" StaticMethod in m1");
	return new StaticMethod();
}
}
