package com.luv2code.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	
	// add new fields for email and team (injecting literal values example)
	private String emailAddress;
	private String team;
		
	public String getEmailAddress() {
		return emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Cricket coach : inside setter method - setTeam");
		this.emailAddress = emailAddress;
	}

	public void setTeam(String team) {
		this.team = team;
	}
	
	//create no-arg constructor
	public CricketCoach() {
		System.out.println("Cricket coach : inside no-arg constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Cricket coach : inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Cricket practice for 1 hr";
	}
	
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
