package com.example.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller 
public class MainController {

	@RequestMapping("/home")
	public String homeString() {
		return "Home.html";
	}
	
	@RequestMapping("/addProgrammer")
	public String addProgrammer(@RequestParam int pID, @RequestParam String pName,
			@RequestParam String pLang, Model model ) {
		
		//System.out.println(pID+" "+pName+" "+pLang);
		model.addAttribute("pID",pID);
		model.addAttribute("pName",pName);
		model.addAttribute("pLang",pLang);
		
		return "ProgrammerInfo.html";
	}
	
}
