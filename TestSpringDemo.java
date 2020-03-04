package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestSpringDemo {
	public static void main(String[] args) {
		/*Resource r=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
		*/
		ApplicationContext obj=new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Customer b=(Customer)obj.getBean("cust2");
		System.out.println(b);
	}

}
