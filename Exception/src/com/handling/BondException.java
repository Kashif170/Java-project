package com.handling;

public class BondException {
public static void main(String[] args) {
	try {
	int a[]= {12,14,15,17,};
	System.out.println(a[5]);
	}
	catch(ArrayIndexOutOfBoundsException e) {
		System.out.println("tanzeel have no money to buy such things");
		System.out.println("but kashif his dad handle it");
		e.printStackTrace();
	}
	
}
}
