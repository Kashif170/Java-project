package com.SetArray;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(20);
		t.add(30);
		t.add(40);
		t.add(50);
		
		System.out.println(t);
		
		NavigableSet<Integer> desc = t.descendingSet();
		System.out.println(desc);
		
		Iterator<Integer> id = t.descendingIterator();
		while(id.hasNext()) {
			System.out.println(id.next());
			
			
			
		
		}	TreeSet<Character> t1 = new TreeSet<Character>();
		t1.add('k');
		t1.add('a');
		t1.add('s');
		t1.add('h');
		t1.add('i');
		t1.add('f');
		
		System.out.println(t1);
		Iterator<Character> it = t1.descendingIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

		
		String name1="";
		for(int i=0;i<t1.size();i++)
		{
			String name="kashif";
			
			if(name.charAt(i)==t1.ceiling(name.charAt(i)))
			{
				name1=name1+String.valueOf(t1.ceiling(name.charAt(i)));
			}
			
		}
		System.out.println(name1);
	}
	

	
}

