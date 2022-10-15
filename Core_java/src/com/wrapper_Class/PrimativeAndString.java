package com.wrapper_Class;

public class PrimativeAndString {
public static void main(String[] args) {
	byte b = 100;
	String string = Byte.toString(b);
	System.out.println(string);
	byte parseByte = Byte.parseByte(string);
	System.out.println(parseByte);
}
}
