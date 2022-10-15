package com.oops.Abstraction;

public  class ThreeSeries extends BMW {
	/*
	 * int a=30; { //a=20; } ThreeSeries(){ a=20; }
	 */
	@Override
	
	  void accelerate() {
	  System.out.println("inside ThreeSeries accelerate method ");
	  final int a=10;
	  }
	


	@Override
	void brake() {
		// TODO Auto-generated method stub
		
	}

}
