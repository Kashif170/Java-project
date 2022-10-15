package com.inheritence;

public class ParentMultilevel implements  Multilevel1  {

	@Override
	public void k1() {
		
		System.out.println("call 1");
	}

	@Override
	public void k2() {
		
		System.out.println("call 2");
	}

	@Override
	public void k3() {
		
		System.out.println("call 3");
	}

}
