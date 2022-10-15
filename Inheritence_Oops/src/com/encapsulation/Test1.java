package com.encapsulation;

import java.io.ObjectInputStream.GetField;

public class Test1 {
	public static void main(String[] args) {
		Student s1=new Student();
		s1.setId(121);
		s1.setAdd("sakinaka");
		s1.setGender("male");
		s1.setName("tyao abdul hassan james gossling");
		s1.setNumber("9893948393");
		System.out.println(s1.getId());
		System.out.println(s1.getAdd());
		System.out.println(s1.getGender());
		System.out.println(s1.getName());
		
	}

}
