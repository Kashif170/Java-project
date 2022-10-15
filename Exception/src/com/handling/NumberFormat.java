package com.handling;

public class NumberFormat {
	public static void main(String[] args) {
		
		String s="Kashif";
		try {
		int parseInt = Integer.parseInt(s);
		System.out.println(s);
		}catch(NumberFormatException e) {
			System.out.println("catch block run");
			System.out.println(e);
			
		}
		finally {
			System.out.println("Safe code run always");
		}
		System.out.println("this code run not run");
	}
	
	
}
