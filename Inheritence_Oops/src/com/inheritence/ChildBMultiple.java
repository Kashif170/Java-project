package com.inheritence;

public class ChildBMultiple extends ChildAMultiple {
	public static void main(String[] args) {
		ChildAMultiple c =  new ChildBMultiple();
		c.m3("name");
		MultipleP t = new ChildBMultiple();
		t.m1(123,987);
		t.m2(10, 14);
		System.out.println("Achieve Multiple inheritance");
	}

}
