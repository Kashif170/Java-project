package com.Immutable;

final class StringChange {
	
	private final int id;
	private final String name;
	 private final String color;
	 
	 StringChange(int id,String name,String color){
		 this.id=id;
		 this.name=name;
		 this.color=color;
		 
		 System.out.println(this.id);
		// System.out.println(this.name);
		// System.out.println(this.color);
	 }
		public static void main(String[] args) {
			
	StringChange c = new StringChange(101,"kashif","black");
	StringChange c1 = new StringChange(101,"kashif","black");
	StringChange c2 = new StringChange(101,"kashif","black");

	String s1 = new String("Tanzeel");//heap n scp
	String s2 = "Tanzeel";//point same object 
	 System.out.println(s1.equals(s2));
	System.out.println(s2);
	
		}
}
