package com.handling;

public class NullPointer {
	public static void main(String[]args) {
		try {
		String s=null;
		System.out.println(s.length());
		}
		catch(NullPointerException e) {
			System.out.println(e);
			
		}
		catch(Exception n){
			System.out.println("run this block");
			
		}
		finally {
			System.out.println("this block is run confirm");
		}
		System.out.println("run this code");
	}

}
