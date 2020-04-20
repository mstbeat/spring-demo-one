package com.luv2code.springdemo;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;
	
	public SwimmingCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim for 1 hour without a break";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
