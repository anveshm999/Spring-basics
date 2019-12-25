package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it: "+fortuneService.getFortune();
	}
	
	// add init method
	
	public void startInit(){
		System.out.println("Trackcoach: Inside init method");
		
	}
	
	//add destroy method
	public void startDestroy(){
		System.out.println("Trackcoach: Inside destroy method");
		
	}
}
