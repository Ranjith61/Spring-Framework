package com.xworkz.sports.game;

import org.springframework.stereotype.Component;

@Component("InternationalCoach")
public class InternationalCoach implements Coach {

	public void train() {
		System.out.println("International Coach");
	}

}
