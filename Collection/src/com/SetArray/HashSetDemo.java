package com.SetArray;

import java.util.HashSet;
import java.util.Random;

public class HashSetDemo {
	public static void main(String[] args) {
		Random d = new Random();
		HashSet<Integer> h = new HashSet<Integer>();
		for(int i=0;i<=10;i++) {
			int a=d.nextInt(7000);
			h.add(a);
		System.out.println(a);
	}System.out.println(h);
	
	}
}
