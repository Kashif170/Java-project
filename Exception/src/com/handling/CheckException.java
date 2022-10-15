package com.handling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckException {
	void readfile() throws FileNotFoundException {
		System.out.println("in readmethod");
		FileInputStream i = new FileInputStream("");
	}

	public static void main(String[] args)
	{
		CheckException e = new CheckException();
		try {
			System.out.println("in try");
			e.readfile();
		} catch (Exception n) {
			System.out.println("in catch");
			System.out.println(n);
		}
	}
}
