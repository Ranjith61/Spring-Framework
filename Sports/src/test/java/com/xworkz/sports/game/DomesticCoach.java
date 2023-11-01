package com.xworkz.sports.game;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("DomesticCoach") //->creating the beans
public class DomesticCoach  implements Coach{

	public void train() {
		System.out.println("Domestic coach");
	}

}
