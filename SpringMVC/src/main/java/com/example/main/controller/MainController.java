package com.example.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.main.Model.Programmer;


@Controller 
@ControllerAdvice
public class MainController {

	@ModelAttribute
	public void welcome(Model m) {
		m.addAttribute("msg","Welcome to Spring Boot Project");
	}
	
	
	//@RequestMapping("/home")
	@GetMapping("/home")
	public String homeString() {
		return "Home.html";
	}
	
	
	//@RequestMapping(value = "/addProgrammer", method = RequestMethod.POST)
	
	@PostMapping("/addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer programmer ) {
		
		//ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("ProgrammerInfo.html");
		
		return "ProgrammerInfo.html";
	}
	
	@GetMapping("/allProgrammer")
	public String allProgrammer(Model m) {
		List<Programmer> p = new ArrayList<Programmer>();
		
		p.add(new Programmer(101, "Karim","Java"));
		p.add(new Programmer(102, "Hasan","C++"));
		p.add(new Programmer(103, "Sayeed","C"));
		
		m.addAttribute("programmers",p);
		
		return "AllProgrammer.html";
	}
}
