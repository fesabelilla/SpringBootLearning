package com.example.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.main.model.Coder;
//import com.sun.org.apache.bcel.internal.classfile.Code;

@SpringBootApplication
public class AutowiredAnnotationApplication {

	public static void main(String[] args) {
	ApplicationContext context = SpringApplication.run(AutowiredAnnotationApplication.class, args);
		
	//Coder coder = context.getBean(Coder.class);
	//coder.petInfo();
	
	Coder coder1 = context.getBean(Coder.class);
	coder1.name = "Hasan";
	System.out.println(coder1.name);
	
	
	Coder coder2 = context.getBean(Coder.class);
	System.out.println(coder2.name);
	
	}

}
