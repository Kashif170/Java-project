package com.handling;

import java.util.Scanner;

public class TestUserException {
void m1(int a,int b) {
	if(a==3 || b==3) {
		throw new UserDefinedException("do not enter 3");	
}
	else {
		System.out.println(a*b);
		}
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Multiply the number");
	int a=sc.nextInt();
	int b=sc.nextInt();
	TestUserException t = new TestUserException();
	try {
		t.m1(a, b);
	}catch(UserDefinedException e) {
		System.out.println("Run this block");
		System.out.println(e.getMessage());
	}
}
	
}
