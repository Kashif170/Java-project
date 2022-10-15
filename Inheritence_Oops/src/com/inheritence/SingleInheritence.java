package com.inheritence;

public class SingleInheritence {
	SingleInheritence(){
		super();
		System.out.println("SingleInheritence");
	}
	void m1() {
		System.out.println("parent ");
				
	}
}
     class B extends SingleInheritence{
    	p(){
    		 
    	 }
    	 int a=10;
    	 
    	 void m2() {
    		 System.out.println("child");
    	 } 
    	 
    	public static void main(String[] args) {
    		SingleInheritence s = new SingleInheritence();
    		
            s.m1();
          	
		} 
     }
     