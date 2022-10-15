package com.list;

import java.util.ArrayList;

public class ArrayListK {
	public static void main(String[] args) {
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(10);
		a.add(20);
		a.add(30);
		System.out.println(a);
		
		a.set(1, 155);
		System.out.println(a);
		
		a.addAll(a);
	System.out.println(a);
		
		ArrayList<Integer> e = new ArrayList<Integer>();
		e.add(40);
		e.add(50);
		e.add(60);
		e.add(70);
		e.addAll(2, a);
		
	
		
		
	}

}
