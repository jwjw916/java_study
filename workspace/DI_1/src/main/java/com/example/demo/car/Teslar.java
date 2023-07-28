package com.example.demo.car;

import org.springframework.stereotype.Component;

@Component
public class Teslar implements Car {

	@Override
	public void drive() {
		System.out.println("테슬라슬라");
		
	}

}
