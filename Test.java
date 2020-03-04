package com.CIusingMap;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.CIusingMap.Question;

public class Test {
public static void main(String args[])
{
	ApplicationContext context=new ClassPathXmlApplicationContext("BeanUser.xml");
	Object o=context.getBean("q");
	Question q=(Question )o;
	System.out.println(q);
}
}
