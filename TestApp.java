package com.AnnoatationExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//import org.Springframework.context.AppplicationCOntext;
public class TestApp {

	public static void main(String[] args) {
		
		ApplicationContext ap=new AnnotationConfigApplicationContext(AppConfig.class);
		HelloWorld hw=ap.getBean("myBean",HelloWorld.class);
		hw.sayHello();
	}

}
