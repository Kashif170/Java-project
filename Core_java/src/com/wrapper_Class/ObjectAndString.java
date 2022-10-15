package com.wrapper_Class;

public class ObjectAndString {

	public static void main(String[] args) {
long x=1000;
Long valueOf = Long.valueOf(x);
System.out.println(valueOf.hashCode());
String obj=valueOf.toString(valueOf);
System.out.println(obj.hashCode());
Object o=obj.valueOf(obj);
System.out.println(o.hashCode());
int parseInt = Integer.parseInt((String) o);
	}

}
