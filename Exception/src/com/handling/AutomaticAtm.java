package com.handling;

import java.util.Scanner;

public class AutomaticAtm {
	static int balance ;
	static float deposit;
	static float withdraw;
	static int amount;	
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1 the account balance ");
	System.out.println("enter 2 for deposit");
	System.out.println("enter 3 for withdraw");
	System.out.println("enter 4 for amount");
	System.out.println("enter 5 exit");
	int in= sc.nextInt();
	switch(in) {
	case1:
	System.out.println( "show the balance: "+balance);
	
	}
	
	
}
}
