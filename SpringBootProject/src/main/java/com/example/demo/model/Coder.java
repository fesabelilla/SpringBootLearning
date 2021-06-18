package com.example.demo.model;

import javax.annotation.PreDestroy;

public class Coder {

	// ctrl + space
	private int id;
	private String name;
	private String language;
	
	private Computer computer;

	// Alt+Shift+S
	// https://stackoverflow.com/questions/53129538/content-autocomplete-in-spring-tool-suite-4/53143625

	public Coder() {
		super();
		System.out.println("No parameter. {Coder class}");
	}

	public Coder(int id, String name, String language, Computer computer) {
		super();
		this.id = id;
		this.name = name;
		this.language = language;
		this.computer = computer;
		System.out.println("With Parameter. {Coder class}");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	//bofore destroy it will bw called
	@PreDestroy
	public void destroy() {
		System.out.println("Coder class destroy");
	}
	
	
	//formatting ctrl + shift + f
}
