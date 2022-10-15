package com.SetArray;

import java.util.HashSet;

public class HastSetAdd {
	public static void main(String[] args) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		HashSet<String> sh = new HashSet<String>();
		hs.add(123);
		hs.add(234);
		hs.add(345);
		hs.add(567);
		
		System.out.println(hs);
		
		sh.add("Kashif");		
		sh.add("Zaid");
		
		System.out.println(sh);
		System.out.println(hs+" "+sh);
		System.out.println(hs.hashCode());
		System.out.println(sh.hashCode());
	}

}
