package com.inheritence;

public class MultilevelTest {

	public static void main(String[] args) {
		Child c =  (Child) new Parent1();
		c.f2();
		c.f2();
		c.hashCode();
	}

}
