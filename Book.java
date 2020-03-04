package com.bean;

public class Book {
int id;
String bname;
int price;
@Override
public String toString() {
	return "Book [id=" + id + ", bname=" + bname + ", price=" + price + "]";
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
}
