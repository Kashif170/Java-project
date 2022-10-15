package com.wrapper_Class;

public class CommondLineArgument {

	public static void main(String[] args) {
		int length = args.length;
		if (length == 0) {
			System.out.println("no input provided");
		} else {
			System.out.println("List of argument");
			for (int i = 0; i < length; i++) {
				System.out.println(args[i]);
			}
		}
	}

}
