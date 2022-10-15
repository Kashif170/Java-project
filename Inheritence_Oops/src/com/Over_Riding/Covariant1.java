package com.Over_Riding;

public class Covariant1 extends Covariant {
	


	int visible() {
		//System.out.println("Impossible to see");
		return  1;
	}
	public static void main(String[] args) {
		
		Covariant v = new Covariant1();
		v.visible();
System.out.println("Impossible to see");
	}

}
