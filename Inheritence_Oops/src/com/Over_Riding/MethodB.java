package com.Over_Riding;

public class MethodB extends MethodA {
	public  void drone() {
		System.out.println("hence product deliever");
	} 
public static void main(String[]args) {
	MethodB o =  new MethodB();
	o.drone();
	MethodA c = new MethodB();
	c.drone();
	
}
}

