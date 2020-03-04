package com.AutowiringByConstructor;



public class Address {
	@Override
	public String toString() {
		return "Address [addid=" + addid + ", loc=" + loc + "]";
	}
	private int addid;
	private String loc;
	int getAddid()
	{
		return addid;
	}
	public String getLoc() {
		return loc;
	}
	public Address(int addid, String loc) {
		super();
		this.addid = addid;
		this.loc = loc;
	}
	
	
	
}
