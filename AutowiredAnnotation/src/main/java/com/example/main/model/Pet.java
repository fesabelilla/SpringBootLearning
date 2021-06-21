package com.example.main.model;

import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

//create a single tone Bean and store in Application Contenier
@Component
public class Pet {

	public Pet() {
		System.out.println("Pet Obj Created");
	}
	
	public  void info() {
		System.out.println("This is a Parrot");
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Pet Obj Destroy");
	}
	
}
