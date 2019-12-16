package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		//load the spring Configuration File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring Container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//call methods of  the bean
		System.out.println(theCoach.getDailyWorkout());
		
		//call new methods for fortune Service
		System.out.println(theCoach.getDailyFortune());
		
		
		
		
		//close the context
         context.close();
	}

}
