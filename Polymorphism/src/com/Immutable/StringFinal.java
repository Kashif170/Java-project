package com.Immutable;

public class StringFinal {
	private final String name;
	private final float height;
	private final float weight;
	private final String color;
	private final String education;
	private final int year;
	private final String course;
	
StringFinal(String name,float height,float weight,String color,String education,int year,String course){
	this.name=name;
	this.height=height;
	this.weight=weight;
	this.color=color;
	this.education=education;
	this.year=year;
	this.course=course;
	System.out.println(name+" "+height+" "+weight+" "+color+" "+education+" "+year+" "+course);
	
}

public static void main() {
	StringFinal f = new StringFinal("kashif",5.4f,82,"white","BCA completed",2018,"JAVA");
	String f1 = new String("King");
	String f2 = "I love java";
	System.out.println(f);
	System.out.println(f1.equals(f2));
	
}
}
