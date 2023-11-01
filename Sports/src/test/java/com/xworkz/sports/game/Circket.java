package com.xworkz.sports.game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Circket implements Sports {
	
	@Autowired //it will create object
	@Qualifier("InternationalCoach")
	private Coach coach;
	
	@Autowired
	@Qualifier("DomesticCoach")
	private Coach coach1;
	//this dependency injected over the spring->dependency injection
	
	public void play() {
		System.out.println("Playing circket");
		coach.train();
	}

	public void practise() {
		System.out.println("Practicing Circket");
	}

	public void view() {
		System.out.println("Viewing Circket");
	}

}
