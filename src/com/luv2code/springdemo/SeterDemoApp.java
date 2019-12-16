package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SeterDemoApp {

	public static void main(String[] args) {
		
		//load the spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		//retrieve the bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		//call methods on the bean
		 System.out.println(theCoach.getDailyWorkout());
		 System.out.println(theCoach.getDailyFortune());
		 System.out.println(theCoach.getEmailAddress());
		 System.out.println(theCoach.getTeam());
		
		//close thecontext
		 context.close();
	}

}
