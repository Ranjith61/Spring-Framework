package com.xworkz.sports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;

import com.xworkz.sports.config.SportsConfig;
import com.xworkz.sports.game.Circket;
import com.xworkz.sports.game.FootBall;
import com.xworkz.sports.game.Sports;

public class SportsTester {

	public static void main(String[] args) {
		Sports circket = new Circket();// lossly coupled 
		FootBall football = new FootBall();//Tightly coupled
		
		ApplicationContext context = new AnnotationConfigApplicationContext(SportsConfig.class);
		Sports circ =context.getBean(Circket.class);
		circ.play();
		
		Sports circ1 =context.getBean(FootBall.class);
		circ1.play();
		
		
		
		
	
		
	}

}
