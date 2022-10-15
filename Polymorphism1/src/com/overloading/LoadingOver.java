package com.overloading;

public class LoadingOver {
	
	public void j1(int a) {
		 
		System.out.println(a);
	}
	public void j1(float f) {
		
		System.out.println(f);
	}
	public void j1(String name) {
		
		System.out.println(name);
		
	}
	public void j1(char d) {
		
		System.out.println(d);
	}
	public static void main(String[] args) {
		LoadingOver y = new LoadingOver();
		y.j1("Kashif");
		y.j1(190f);
		y.j1(10);
		y.j1('c');
	}

}
