package com.xworkz.movies;

import org.springframework.stereotype.Component;

@Component
public class BollyWood implements Movie {

	public void produce() {
		System.out.println("Invoking produce in Bollywood");
	}

	public void promote() {
		System.out.println("Invoking promote in Bollywood");
	}

	public void release() {
		System.out.println("Invoking release in Bollywood");
	}

}
