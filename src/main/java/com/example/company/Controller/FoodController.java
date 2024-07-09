package com.example.company.Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.company.model.FoodCart;
import com.example.company.model.food;
import com.example.company.service.foodService;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@Controller
public class FoodController {
	@Autowired
	foodService service;

	@GetMapping("/addTocart/{id}")
	public String singlefood(@PathVariable("id")int foodid,Model model,HttpSession session, HttpServletResponse response) throws IOException,NullPointerException
	{
		PrintWriter out=response.getWriter();
		ArrayList<FoodCart> cartlist=new ArrayList<>();
		FoodCart cart=new FoodCart();
		ArrayList<FoodCart> cart_list=(ArrayList<FoodCart>) session.getAttribute("cart-list");
	
	food meal=service.singlefood(foodid);
	
	cart.setCartid(foodid);
	cart.setQuantity(1);
	
	cart.setEat(meal);
	
	
	service.savefood(cart);
	
	if(cart_list==null)
	{
		cartlist.add(cart);
		session.setAttribute("cart-list", cartlist);
		out.println("session created and product added");
	}
	else
	{
		cartlist=cart_list;
		boolean exist=false;
		for(FoodCart c:cart_list)
		{
			if(c.getCartid()==foodid)
			{
				exist=true;
				out.println("product exist");
			}
		}
		if(!exist)
		{
			cartlist.add(cart);
			out.println("product added");
		}
}
	model.addAttribute("foodlist", cartlist);
	return "redirect:/foodcart";
	}

	@GetMapping("/foodcart")
	public String foodcart(Model model,FoodCart fd)
	{
		List<FoodCart> foodlist=service.allorder(fd);
	
		model.addAttribute("foodlist", foodlist);
	    return"foodcart";
		
	}

}
