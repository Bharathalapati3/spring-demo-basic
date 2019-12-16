package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	//create a no arg constructor
	public CricketCoach() {
		System.out.println("Inside CricketCoach constructor");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside CricketCoach FortuneService setter Method");
		this.fortuneService = fortuneService;
	}
    
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		System.out.println("Inside CricketCoach emailAddress setter Method");
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("Inside CricketCoach Team setter Method");
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Practice Fast Bowling for 15 minutes a day";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

}
