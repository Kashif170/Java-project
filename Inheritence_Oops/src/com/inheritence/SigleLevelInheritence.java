package com.inheritence;

public class SigleLevelInheritence extends B{
	int a=10;
	public SigleLevelInheritence() {
		super();
		System.out.println("in const");
	}
	void m1() {
		
		System.out.println("in m1"+this.a);
	}
public static void main(String[] args) {
	SigleLevelInheritence s1 = new SigleLevelInheritence();

	s1.m1();
	
	System.out.println(s1.hashCode());
	System.out.println(s1.getClass());
}
}
