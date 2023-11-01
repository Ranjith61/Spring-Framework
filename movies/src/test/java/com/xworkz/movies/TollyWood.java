package com.xworkz.movies;

import org.springframework.stereotype.Component;

@Component
public class TollyWood implements Movie {

	public void produce() {
		System.out.println("Invoking produce in Tollywood");
	}

	public void promote() {
		System.out.println("Invoking promote in Tollywood");
	}

	public void release() {
		System.out.println("Invoking release in Tollywood");
	}

}
