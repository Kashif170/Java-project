package com.datahandle;

public class ChildWrapper {

	public static void main(String[] args) {
		ObjectGet o = new ObjectGet();
		ObjectGet k = new ObjectGet();
		o.setId(1);
		o.setHeight(6);
		o.setName("kashif");
		o.setWeight(82);
		o.setColor("white");
		
		k.setId(132);
		k.setHeight(7);
		k.setName("King");
		k.setWeight(80);
		k.setColor("Brown");
		System.out.println(o);
		System.out.println(k.hashCode());
		System.out.println(o.hashCode());
		System.out.println(k.toString());
		
	}

}
