package com.bean;

public class Customer {
Person p;
int mob;
public int getMob() {
	return mob;
}

public void setMob(int mob) {
	this.mob = mob;
}

public Person getP() {
	return p;
}

public void setP(Person p) {
	this.p = p;
}

@Override
public String toString() {
	return "Customer [p=" + p + ", mob=" + mob + "]";
}




}
