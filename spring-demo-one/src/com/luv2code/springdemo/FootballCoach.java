package com.luv2code.springdemo;

public class FootballCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Pratice corner kicks";
	}

	@Override
	public String getDailyFortune() {
		return null;
	}

}
