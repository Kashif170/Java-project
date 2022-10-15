package com.FlowStatement;

import java.util.Scanner;

public class FlowAB {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int timing = sc.nextInt();
		
		if(timing==11) {
			System.out.println("The dOOr will be OpeN at 11pm");
		}else if(timing==12)
		{
			System.out.println("The dOOr will also OpeN at 12pm");
		}else if(timing==1) {
			System.out.println("The dOOr will close aT  1m ");
		}else {
			System.out.println("Nikal Bhadwe");
		}
		
		
	}
}
