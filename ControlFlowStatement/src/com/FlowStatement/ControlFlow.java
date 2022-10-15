package com.FlowStatement;
import java.util.Scanner;
public class ControlFlow {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		
		if(age > 18) {
			System.out.println("who born in 1900s he/she will be adult");
		}else {
			System.out.println("who born in 2000s he/she will be not adult yet");
		}
	}

}
