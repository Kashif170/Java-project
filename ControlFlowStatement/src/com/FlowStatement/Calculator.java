package com.FlowStatement;

import java.util.Scanner;

public class Calculator {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("which operation do u want(+,-,*,/) :");
	String calc = sc.next();
	
	switch(calc) {
	case  "+":
		System.out.println("Fisrt number is for add");
	
		int add = sc.nextInt();
		
		break;
		
	case "-":
		System.out.println("Second number is for sub");
		int sub = sc.nextInt();
		break;
		
	case "*":
		System.out.println("third number is for multiply");
		int multiply = sc.nextInt();
		break;
	case"/":
		System.out.println("Fourth number is divide");
		int division = sc.nextInt();
		break;
	}
	
}
}
