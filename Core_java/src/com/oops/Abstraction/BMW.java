
package com.oops.Abstraction;

public abstract class BMW {
void commonFunction() {
	System.out.println("inside commonFunction() method");
}
abstract  void accelerate();
abstract  void brake();
public static void main(String[] args) {
	//BMW b = new BMW();
	System.out.println("main method");
}
}
