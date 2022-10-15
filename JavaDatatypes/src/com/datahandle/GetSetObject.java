package com.datahandle;

public class GetSetObject {
	
	private int id;
	private float height;
	private String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return 976988695;
	}
	@Override
	public String toString() {
		return "My name is : "+name+ "	 " + "ID is : " + id + " 	" + "Height is : "  + height;
	}
	
	@Override
	public boolean equals(Object obj) 
	{
		GetSetObject g =  (GetSetObject) obj;
		if (g.getId() == this.id && g.getHeight() == this.height && g.getName() == this.name ) 
		{
			return true;
		}
		else 
		{
		return false;
		}
	}
}