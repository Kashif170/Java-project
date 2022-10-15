package OverRiding_1;

public class OverAbc extends LoadedOverRiding {
	
	void k1() {
		System.out.println("when lion hungry he eats");
	}
	void k1(int a,int b) {
		System.out.println(a+b);
	}
	public static void main(String[] args) {
		LoadedOverRiding  o = new LoadedOverRiding ();
		o.k1();
	}

}
