package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.example.demo.config.BeanConfig;
import com.example.demo.model.Coder;
import com.example.demo.model.Software;

@SpringBootApplication
//@ImportResource({"classpath:BeanConfig.xml"})
//@ImportResource({"classpath:SoftBean.xml"}) // for xml

@Import({BeanConfig.class})

public class SpringBootProjectApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(SpringBootProjectApplication.class, args);
	
	// XML Based Setter Injection
	
		//Coder c1 = (Coder) context.getBean("coder1"); 
		
		//System.out.println(c1.getName());
		//System.out.println(c1.getComputer().getBrand());
	
		
	// XML Based Constructor Injection
		//Software software = (Software) context.getBean("software");
		//System.out.println(software.getName());
		//System.out.println(software.getComputer().getBrand());
	
	// Java based
	
	Coder c1 = (Coder) context.getBean("coder1"); 
	
	System.out.println(c1.getName());
	System.out.println(c1.getLanguage());
	System.out.println(c1.getComputer().getBrand());
		
	}

}
