package com.Immutable;

import sun.applet.Main;

public class CombinedString {
	
	private final int id;
	private final int pincode;
	private final float kilometer;
	private final String address;
	
	CombinedString(int id,int pincode,float kilometer,String address)
	{
		this.id=id;
		this.pincode=pincode;
		this.kilometer=kilometer;
		this.address=address;
		System.out.println(id+" "+pincode+" "+kilometer+" "+address);
	}
		public static void main(String[]args) {
		CombinedString s = new CombinedString(201,400079,10.3f," Bandra west");	
		String s1 = new String("King");
		String s2="kashif";
		System.out.println(s);
		System.out.println(s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
	}
	
	
}
