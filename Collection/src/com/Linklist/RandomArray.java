package com.Linklist;

import java.util.Random;
import java.util.Scanner;

public class RandomArray {
	public static void main(String[] args) {
		Random r = new Random();
		int i = r.nextInt(2000);
		System.out.println(i);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("eNteR oTp");
		int a = sc.nextInt();
		
		if(i==a) {
			System.out.println("valiD oTp");
		}else {
			System.out.println("InValiD oTp");
			
		}
		
	}

}
