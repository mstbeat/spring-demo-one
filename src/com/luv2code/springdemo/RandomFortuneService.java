package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		List<String> fortuneList = new ArrayList<String>();
		fortuneList.add("Today is your lucky day");
		fortuneList.add("Today is your OK day");
		fortuneList.add("Today is your bad day");
		
		int num = new Random().nextInt(3);
		
		return fortuneList.get(num);
	}

}
