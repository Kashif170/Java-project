package com.Linklist;

import java.util.ArrayList;

public class ArrayListToArray {
	public static void main(String[] args) {
		String[] a= {"Kashif","Hassan","tanzeel","Junaid","Ajaz"};
		ArrayList<String> r = new ArrayList<>();
		
		for(String r1:a) {
			r.add(r1);
		}
			System.out.println("ArrayList ----to--- Array--: " +r);
			
			String[] n = new String[r.size()];
			for(int j=0;j<n.length;j++) {
				n[j]=r.get(j);
			}
			for(String g:n) {
				System.out.println(g);
				
			}
			
		
	}

}
