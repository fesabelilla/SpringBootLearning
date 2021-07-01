package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.main.Model.Programmer;

@Controller 
public class MainController {

	@RequestMapping("/home")
	public String homeString() {
		return "Home.html";
	}
	
	@RequestMapping("/addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer programmer ) {
		
		//ModelAndView modelAndView = new ModelAndView();
		//modelAndView.setViewName("ProgrammerInfo.html");
		
		return "ProgrammerInfo.html";
		
	}
	
}
