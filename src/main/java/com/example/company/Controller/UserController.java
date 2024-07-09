package com.example.company.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.company.model.User;
import com.example.company.service.UserService;

import jakarta.servlet.http.HttpSession;


@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@PostMapping("/register")
	public String getUser(@ModelAttribute User user,Model model)
	{
		service.saveuser(user);		
		
		return "login";
	}
	
	@GetMapping("/userlogin")
	public String userlogin(@RequestParam("password") int password,HttpSession session)
	{
		User user=service.loginUser(password);
		if(user!=null)
		{
			session.setAttribute("person", user);
			return"foodcart";
		}
		else
		{
		return"login";
		}
	}
}
