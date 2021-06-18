package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.model.Coder;

@SpringBootApplication
@ImportResource({"classpath:BeanConfig.xml"})
public class SpringBootProjectApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
	
		Coder c1 = (Coder) context.getBean("coder1"); 
		System.out.println(c1.getName());
		System.out.println(c1.getComputer().getBrand());
	}

}
