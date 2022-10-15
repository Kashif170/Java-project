package com.tokenstring;

import java.util.StringTokenizer;

public class TokenGiven {
	public static void main(String[] args) {
		
		String s = "Forgot, the, past, because, future,is, your, hand";
		StringTokenizer st = new StringTokenizer(s,"",false);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
	}

}
