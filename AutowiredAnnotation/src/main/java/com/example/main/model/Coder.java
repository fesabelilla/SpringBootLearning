package com.example.main.model;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//import com.sun.beans.introspect.PropertyInfo.Name;

//Bean Class
@Component
@Scope(value = "prototype")
public class Coder {
	
	public String name;

	// for injection dependencies
	@Autowired
	Pet pet ;

	public Coder() {
		System.out.println("Coder Obj Created");
	}

	public void petInfo() {
		pet.info();
	}
	
	@PreDestroy
	public void destroy() {
		System.out.println("Coder Object Destroyed");
	}
	
	
	
}
