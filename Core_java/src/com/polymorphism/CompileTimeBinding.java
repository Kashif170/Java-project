package com.polymorphism;

public class CompileTimeBinding {
void add(int a, int b,int c) {
	int result =a+b+c;
	System.out.println("Result is int3>>"+result);Keyboard
}
void add(int a, int b) {
	int result =a+b;
	System.out.println("Result is int2 >>"+result);
}void add(float a, float b) {
	float result =a+b;
	System.out.println("Result is float >>"+result);
}
public static void main(String[] args) {
	CompileTimeBinding c = new CompileTimeBinding();
	c.add(1, 2);
	c.add(1f, 2f);
	c.add(1, 2,3);
}
}
