package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/aloneconfig.xml");
		
		Person person1=con.getBean("person1" ,Person.class);
		
		System.out.println(person1);
		
		System.out.println(person1.getFriends().getClass().getName());
		
		System.out.println("____________________________________________________________________________________");
		
		System.out.println(person1.getFeesstructure());
		
		System.out.println(person1.getFeesstructure().getClass().getName());
		
		System.out.println("_____________________________________________________________________________________");
		
		System.out.println(person1.getProperties());
		
		System.out.println(person1.getProperties().getClass().getName());
	
	}

}
