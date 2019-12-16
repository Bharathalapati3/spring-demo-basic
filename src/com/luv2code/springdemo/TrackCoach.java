package com.luv2code.springdemo;

public class TrackCoach implements Coach {
	
	private FortuneService  fortuneService;
	
	public TrackCoach() {}
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	//for Bean Init and Destroy
	public void doMyStartupStuff() {
		System.out.println("Inside TrackCoach doMystartupStuffMethod");
	}
	
	//add a destroy Method
	
	public void doMyCleanupStuff()
	{
		System.out.println("Inside TrackCoach doMyCleanStuffMethod");
	}
}
