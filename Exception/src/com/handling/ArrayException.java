package com.handling;

import java.util.Scanner;

public class ArrayException {
	public static void main(String[] args) {
		int a[] = { 11, 13, 13, 14, 15, };
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index number");
		int b = sc.nextInt();
		try {
			System.out.println(a[b]);

			System.out.println("Disturb the flow of program");
		} catch (Exception e) {
			System.out.println("Array index run");
			System.out.println(e);
		}
	}
}
