package com.Immutable;

final class Changeble {
	
	private final int id;
	private final String state;
	private final String name;
	
Changeble(int id,String state, String name){
	this.id=id;
	this.state=state;
	this.name=name;
	
	System.out.println(id+"** :"+state+" :** "+name);
}
public static void main(String[] args) {
	Changeble b = new Changeble(789,"Maharashtra","India");
	String b1 = new String("Kashif");
	String b2 = "Hurera";
	System.out.println(b1.equals(b2));
	System.out.println(b2);
}

}

