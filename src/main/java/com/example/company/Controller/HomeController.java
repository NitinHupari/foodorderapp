package com.example.company.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.company.model.food;
import com.example.company.service.foodService;

@Controller
public class HomeController {

	@Autowired
	foodService service;
	
	
	@GetMapping("/home")
	public String home(food meal,Model model) 
	{
		//List<food> eat=service.allfood(meal);
		model.addAttribute("food", service.allfood(meal));
		
		return"home";
	}
	
	@GetMapping("/login")
	public String login() 
	{
		return"login";
	}
	
	@GetMapping("/register")
	public String register() 
	{
		return"register";
	}
	
	@GetMapping("/finalsave")
	public String foodUserSave()
	{
		return "finalsave";
	}
	@GetMapping("/checkout")
	public String checkout()
	{
		return"checkout";
	}
}
