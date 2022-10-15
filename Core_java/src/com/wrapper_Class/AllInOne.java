package com.wrapper_Class;

public class AllInOne {

	public static void main(String[] args) {
int x =100;
String y = Integer.toString(x);
Integer b = new Integer(y);
int z = b.intValue();
Integer valueOf = Integer.valueOf(z);
Integer c = new Integer(z);
String d = c.toString();
int parseInt = Integer.parseInt(d);	
}

}
