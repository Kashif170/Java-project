package com.handling;

public class MultipleCatch {
	public static void main(String[] args) {
		try {
		String k = args[11];
		System.out.println("output"+k);
		int parseInt = Integer.parseInt(k);
		System.out.println(parseInt);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Index of out of bond");
			System.out.println(e);
		}
		catch(NullPointerException n) {
		System.out.println("run null pointer");	
		System.out.println(m);
		}
		catch(Exception k) {
			System.out.println("run the father of class");
		}
			
		}
		
	}


