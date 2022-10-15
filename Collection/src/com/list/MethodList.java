package com.list;

import java.util.ArrayList;

public class MethodList {
	public static void main(String[] args) {
		
	
	
	ArrayList<Integer> b1 = new ArrayList<Integer>();
	for(int i=0; i<=100;i=i+10) {
		b1.add(i);				
	}System.out.println("b1:"+b1);
	System.out.println(" b1 Add Fisrt list: "+b1);
	b1.add(1,101);
	
	b1.add(3,201);
	System.out.println(" b1 Add Second list :"+b1);
	
	b1.add(13,165);
	System.out.println(" b1 Add Third list:"+b1);
	System.out.println("");
	
	ArrayList<Integer> c1 = new ArrayList<Integer>();
	c1.add(600);
	c1.add(700);
	c1.add(800);
	c1.add(900);
	c1.add(1000);
	
	System.out.println("c1 :"+c1);
	c1.add(4,901);
	System.out.println("c1: First List"+c1);
	c1.addAll(c1);
	System.out.println("c1"+b1);
	
	}
	
}
