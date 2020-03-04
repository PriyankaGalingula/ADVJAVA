package com.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//import org.springframework.context.ApplicationContext;
	//import org.springframework.context.support.ClassPathXmlApplicationContext;
	//import org.springframework.context.support.FileSystemXmlApplicationContext;

	public class TestCollection {
		public static void main(String[] args) {
			/*Resource r=new ClassPathResource("ApplicationContext.xml");
			BeanFactory factory=new XmlBeanFactory(r);
			*/
			ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
			Object o=context.getBean("l");
			Library l=(Library)o;
			System.out.println(l);
		}

	}


