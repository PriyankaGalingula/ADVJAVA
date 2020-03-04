package com.bean;

public class Person {
String name;
String Address;



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "Person [name=" + name + ", Address=" + Address + "]";
}


}
