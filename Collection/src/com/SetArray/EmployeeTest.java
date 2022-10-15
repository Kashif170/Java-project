package com.SetArray;

import java.util.HashSet;

public class EmployeeTest {
	public static void main(String[] args) {
		EmployeeSet e = new EmployeeSet();
		e.setId(100);
		e.setName("Kashif");
		
		EmployeeSet e1 = new EmployeeSet();
		e1.setId(100);
		e1.setName("Kashif");
		
		HashSet<EmployeeSet> h = new HashSet<EmployeeSet>();
		h.add(e);
		h.add(e1);
		System.out.println(h);
	}

}
