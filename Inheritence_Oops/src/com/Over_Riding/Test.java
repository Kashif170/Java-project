package com.Over_Riding;

public class Test {
public static void main(String[] args) {
	StaticMethod st = new StaticMethod2();
	System.out.println(st.s);
	st.m1();
	//StaticMethod2.m1();
	//StaticMethod st;
	
	//StaticMethod.m1();
}
}
