package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class MainController {

	@RequestMapping("/home")
	public String homeString() {
		return "Home.html";
	}
	
	@RequestMapping("/addProgrammer")
	
	//public String addProgrammer(@RequestParam int pID, @RequestParam String pName,
		//	@RequestParam String pLang, Model model )
	
	public ModelAndView addProgrammer(@RequestParam("pID") int id, @RequestParam("pName") String name,
		@RequestParam("pLang") String language, Model model ) {
		
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.setViewName("ProgrammerInfo.html");
		
		modelAndView.addObject("pName",name);
		modelAndView.addObject("pID",id);
		modelAndView.addObject("pLang", language);
		
		return modelAndView;
		
	}
	
}
