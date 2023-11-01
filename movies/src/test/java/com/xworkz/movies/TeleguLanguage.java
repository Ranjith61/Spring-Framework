package com.xworkz.movies;

import org.springframework.stereotype.Component;

@Component("TeleguLanguage")
public class TeleguLanguage implements Language {

	public void type() {
		System.out.println("Telegu language");
	}

}
