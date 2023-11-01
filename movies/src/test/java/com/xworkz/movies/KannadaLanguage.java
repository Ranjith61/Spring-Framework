package com.xworkz.movies;

import org.springframework.stereotype.Component;

@Component("KannadaLanguage")
public class KannadaLanguage implements Language {

	public void type() {
		System.out.println("KannadaLanguage");
	}

}
