package com.array;

public class InstanceArr {
	public int a=11;
	public InstanceArr(Integer ex){
		this.a=a-ex;
		System.out.println("value of a="+a);
	}
	
	public static void main(String[]args) {
		InstanceArr i = new InstanceArr(11);
		InstanceArr i2 = new InstanceArr(22);
		InstanceArr i3 = new InstanceArr(33);
		InstanceArr i4 = new InstanceArr(45);
		InstanceArr i5 = new InstanceArr(55);
		InstanceArr i6 = new InstanceArr(65);
	}

}
