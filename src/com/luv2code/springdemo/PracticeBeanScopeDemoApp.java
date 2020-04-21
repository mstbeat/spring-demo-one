package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeanScopeDemoApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		// retrieve bean from spring container
		Coach theCoach = context.getBean("mySwimmingCoach", Coach.class);
		Coach alphaCoach = context.getBean("mySwimmingCoach", Coach.class);
		
		// check if they are the same
		boolean result = (theCoach == alphaCoach);
		
		// print out the result
		System.out.println("\nPointing to the same object: " + result);
		System.out.println("\nMemory location for theCoach: " + theCoach);
		System.out.println("\nMemory location for alphaCoach: " + alphaCoach + "\n");
		
		System.out.println("theCoach's fortune: " + theCoach.getDailyFortune());
		System.out.println("alphaCoach's fortune: " + alphaCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
