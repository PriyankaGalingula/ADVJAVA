package com.CIusingMap;

import java.util.Map;
import java.util.Set;

import java.util.Iterator;

import java.util.Map.Entry;

public class Question {
private int id;
private String name;
private Map<String,String>answers;
public Question()
{
	
}
public Question(int id,String name,Map<String,String> answers)
{
	super();
	this.id=id;
	this.name=name;
	this.answers=answers;
}
@Override
public String toString() {
	return "Question [id=" + id + ", name=" + name + ", answers=" + answers + "]";
}
public void displayInfo()
{
	System.out.println(id);
	System.out.println(name);
	System.out.println("answers...");
	
	Set<Entry<String,String>> set=answers.entrySet();
	Iterator <Entry<String,String>> itr=set.iterator();
	while(itr.hasNext())
	{
		Entry<String,String> entry=itr.next();
		System.out.println("Answer:" +entry.getKey()+ "posted by" + entry.getValue());
	}

}
}
