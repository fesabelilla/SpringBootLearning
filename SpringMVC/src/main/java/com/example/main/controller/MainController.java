package com.example.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.example.main.repository.ProgrammerRepo;


@Controller 
@ControllerAdvice
public class MainController {
	
	@Autowired
	ProgrammerRepo pr;
	
	@GetMapping("/home")
	public String homeString() {
		return "Home.html";
	}
	
	//CRUD Operation
	
	@PostMapping("/addProgrammer")
	public String addProgrammer(@ModelAttribute Programmer programmer ) {
		
		pr.save(programmer);
		
		return "redirect:/home";
	}
	
	@PostMapping("/findById")
	public String findById(@RequestParam int pID, Model model) {
		Programmer p = pr.getOne(pID);
		
		model.addAttribute("programmer",p);
		
		return "ProgrammerInfo.html";
	}
	
	@PostMapping("/findBypLang")
	public String findBypLang(@RequestParam String pLang, Model model) {
		List<Programmer> p = pr.findP(pLang);
		
		model.addAttribute("programmers",p);
		
		return "AllProgrammer.html";
	}
	
	
	@GetMapping("/deleteProgrammer")
	public String deleteProgrammer(@RequestParam int pID,Model model) {
		pr.deleteById(pID);
		
		return "redirect:/home";
	}
	
	@PostMapping("/updateProgrammer")
	public String updateProgrammer(@ModelAttribute Programmer programmer) {
		
		Programmer p = pr.getOne(programmer.getpID());
		
		p.setpName(programmer.getpName());
		p.setpLang(programmer.getpLang());
		
		pr.save(p);
		
		return "ProgrammerInfo.html";
	}
	
	
	
}
