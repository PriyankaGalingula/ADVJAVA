package com.AutowiringByConstructor;

public class Employee {
	int salary;
	private Address add;
	public Employee()
	{
		
	}
	public Employee(Address add)
	{
		this.add=add;	
	}
	public Address getAdd()
	{
		return add;
	}
	public void setAdd(Address add)
	{
		this.add=add;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", add=" + add + "]";
	}
}
