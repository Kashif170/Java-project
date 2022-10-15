package com.abstract_implement;

public class Normal extends Newtest{

	



public static void main(String[] args) {
	InterfaceA n = new Normal();
	n.m3();
	n.m4();
	
	n.m2();
	
	
	
}

@Override
public void m2() {
	// TODO Auto-generated method stub
	System.out.println("in m2");
}

@Override
public void m3() {
	// TODO Auto-generated method stub
	System.out.println("in m3");

}

@Override
public void m4() {
	// TODO Auto-generated method stub
	System.out.println("in m4");

}
}
