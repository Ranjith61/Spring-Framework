package com.xworkz.movies;

import org.springframework.stereotype.Component;

@Component("EnglishLanguage")
public class EnglishLanguage implements Language {

	public void type() {
		System.out.println("EnglishLanguage");
	}

}
