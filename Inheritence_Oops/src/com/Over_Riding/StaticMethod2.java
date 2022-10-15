package com.Over_Riding;

public class StaticMethod2 extends StaticMethod {
	String s ="abcd";
	public StaticMethod2 m1() {
		System.out.println(" StaticMethod2 in m1");
		return new StaticMethod2();
	}

}
