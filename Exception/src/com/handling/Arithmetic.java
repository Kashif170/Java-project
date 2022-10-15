package com.handling;

import java.util.Scanner;

public class Arithmetic {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		try {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println(a/b);
		}
		
		catch(ArithmeticException kashif){
			System.out.println("in catch block");
			
		}
		
	}

}
