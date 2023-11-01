package com.xworkz.movies.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.xworkz.movies.BollyWood;
import com.xworkz.movies.HollyWood;
import com.xworkz.movies.Movie;
import com.xworkz.movies.TollyWood;
import com.xworkz.movies.cofig.MoviesConfig;

public class MoviesTester {
	public static void main(String[] args) {
		Movie holly = new HollyWood();//Loose Coupling
		TollyWood tolly = new TollyWood();//Tight Coupling
		
		ApplicationContext context = new AnnotationConfigApplicationContext(MoviesConfig.class);
		Movie holly1 = context.getBean(HollyWood.class);
		holly1.produce();
		
		Movie tolly1 = context.getBean(TollyWood.class);
		tolly1.promote();
		
		Movie bolly = context.getBean(BollyWood.class);
		bolly.release();
		
//		@Configuration ->mentioning that it is a configuration class
//		@Component -> it is scanned by component scan it will be generated
//		@bean -> method ehich gives object works
		
		
		
	}

}
