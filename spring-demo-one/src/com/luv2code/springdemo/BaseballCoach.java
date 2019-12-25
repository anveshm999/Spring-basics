package com.luv2code.springdemo;

public class BaseballCoach implements Coach{
	
	//define private field for dependency
	private FortuneService fortuneService;
	
	//define constructor for dependency injection
	public  BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	
	@Override
	public String getDailyWorkout(){
		return "Spend 30 min";
	}

	@Override
	public String getDailyFortune() {
		//use my fortuneService to get fortune
		return fortuneService.getFortune();
	}
}
