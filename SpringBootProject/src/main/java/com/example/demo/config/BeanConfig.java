package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.model.Coder;
import com.example.demo.model.Computer;

@Configuration
public class BeanConfig {
	
	@Bean
	public Coder coder1(Computer computer) {
		Coder c1 = new Coder();
		c1.setId(1001);
		c1.setName("Zahid");
		c1.setLanguage("Java");
		c1.setComputer(computer);

		return c1;
	}
	
	@Bean
	public Computer computer1() {
		Computer com1 = new Computer();
		com1.setBrand("ASUS");
		
		return com1;
	}
	
}
