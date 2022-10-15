package com.stringTest;

public class ReversedString{
String firstway(String actual) {
	String reversed ="";
	for(int i=actual.length(); i>0;i--) {
	reversed+=actual.charAt(i-1);	
	}
	return reversed;
}
	public static void main(String[]args) {
		
	ReversedString str = new ReversedString();
	String sr = "Kashif";
	System.out.println(str.firstway(sr));
	
	}
	
	
	
}


