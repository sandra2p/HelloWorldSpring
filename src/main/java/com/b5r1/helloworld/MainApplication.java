package com.b5r1.helloworld;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
	    HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
	    obj.getMessage();
	      
	    GoodbyeWorld objbye = (GoodbyeWorld) context.getBean("byeWorld");
	    objbye.getMessage();  
	}

}
