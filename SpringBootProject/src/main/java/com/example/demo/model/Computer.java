package com.example.demo.model;

import javax.annotation.PreDestroy;

public class Computer {

	private String brand;

	public Computer() {
		super();
		System.out.println("No parameter. {Computer class}");
	}

	public Computer(String brand) {
		super();
		this.brand = brand;
		System.out.println("With parameter. {Computer class}");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@PreDestroy
	public void destroy() {
		System.out.println("Computer class destroy");
	}
}
