package com.Immutable;

public final class Scp_Reference {
	
	private final int id;
	private final String name;
	private final String address;
	private final String color;
	private final int pincode;
	
	Scp_Reference(int id,String name,String address,String color,int pincode){
		this.id=id;
		this.name=name;
		this.address=address;
		this.color=color;
		this.pincode=pincode;
		System.out.println(id+" "+name+" "+address+" "+color+" "+pincode);
	}
	public static void main(String[] args) {
		Scp_Reference h= new Scp_Reference(143,"kashif", "vikhroli parksite","white",400079);
		String s = new String("King");
		System.out.println(h);
		System.out.println(s);
		System.out.println(s.equals(h));
		
		String s1="abcd";
		String s2="abc";
		String s3="ab";
		String s4="abcb";
		String s5="bcab";
		
		String a = new String("abcd");
		String b = new String("bcab");
		String c = new String("ab");
		String d = new String("cba");
		String e = new String("abcd");
		String f = new String("abcb");
		System.out.println(a==s3);//false
		System.out.println(c==s2);//false
		System.out.println(s4==f);//false
		System.out.println(s3==c);//false
		System.out.println(s3.equals(b));//false
		System.out.println(s1.equals(a));//true
		System.out.println(a.equals(f));//false
		System.out.println(f.equals(s4));//true
	}
}
