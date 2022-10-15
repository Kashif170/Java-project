package com.Linklist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import com.sun.javafx.scene.control.skin.VirtualFlow.ArrayLinkedList;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

public class LinkListDemo {
	public static void main(String[] args) {
		
		LinkedList<String> ls = new LinkedList<>();
		ls.add("Kashif");
		ls.add(null);
		ls.add(null);
		ls.add(null);
		ls.add("Kashif");
		ls.add("King");
		ls.add("Java");
		
		System.out.println(ls);
		//ls.remove();
		
		System.out.println("Tak");
		System.out.println(ls.lastIndexOf("King"));
		
		System.out.println(ls.indexOf("Kashif"));
		System.out.println(ls.getFirst());
		System.out.println(ls.getLast());
		System.out.println(ls.hashCode());
		System.out.println(ls.clone());
		System.out.println(ls.element());
		ls.clear();
		System.out.println(ls);
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(10);
		
		Collections.sort(al);
		System.out.println();
		System.out.println(al);
		for(Integer i:al) {
			System.out.println(i);
		}
		Collections.reverse(al);
		System.out.println(al);
		System.out.println(al.addAll(al));
		System.out.println(al.equals(al));
		System.out.println(al.isEmpty());
		
	}
}
