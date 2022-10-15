package com.datahandle;

public class WrapperO {
public static void main(String[]args) {
	GetSetObject j=new GetSetObject();
	GetSetObject i=new GetSetObject();
	j.setId(420);
	j.setHeight(5.9f);
	j.setName("James Gosling2");
	i.setId(420);
	i.setHeight(5.9f);
	i.setName("James Gosling");
	System.out.println(j);
	System.out.println(j.hashCode());
	//System.out.println(j.toString());
	System.out.println(j.equals(i));

}
}