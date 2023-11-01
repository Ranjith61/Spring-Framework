package com.xworkz.sports.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.sports.game.Circket;

@Configuration
@ComponentScan("com.xworkz.sports.game")  // ->it will creates beans
public class SportsConfig {
	
//	@Bean // ->whenever the object nedded it will execute and give object
//	public Circket getCircket() {
//		return new Circket();
//	}
//	
//	public FootBall getFootBall() {
//		return new FootBall();
//	}

}
