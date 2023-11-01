package com.xworkz.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HollyWood implements Movie {
	
	@Autowired
	@Qualifier("TeleguLanguage")
	private Language language;
	
	@Autowired
	@Qualifier("KannadaLanguage")
	private Language language1;

	public void produce() {
		System.out.println("Invoking produce in HollyWood");
		language.type();
	}

	public void promote() {
		System.out.println("Invoking promote in HollyWood");
	}

	public void release() {
		System.out.println("Invoking release in HollyWood");
	}

}
