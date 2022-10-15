package com.list;

import java.util.ArrayList;

public class StringArrayList {
	public static void main(String[] args) {
		ArrayList a1 = new ArrayList();
		a1.add("Kashif");
		a1.add("is");
		a1.add('a');
		a1.add("King");
		
		System.out.println("Allways: "+a1 );
		
		ArrayList d1 = new ArrayList();
		d1.add( 'I');
		d1.add("Am");
		d1.add("The");
		d1.add( "Java");
		d1.add( "Developer");
		System.out.println(d1);
		d1.set(0, "Hey");
		//d1.addAll(4, "Developer");

		System.out.println(d1);

	}

}
