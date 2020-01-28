package com.luv2code.springdemo;

import java.util.Random;

public class StrangeFortuneService implements FortuneService {
	
	String[] fortunes = new String[]{"You will meet somebody", "You achieve a lot", "This is your year"};
	
	public int getRandomNumber() {
		return new Random().nextInt(3);
	}
	
	public int getRandomOldWay() {
		return (int) (Math.random() * 3);
	}

	@Override
	public String getFortune() {
		return fortunes[getRandomOldWay()];
	}

}
