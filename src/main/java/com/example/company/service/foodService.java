package com.example.company.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.company.Dao.CartInterface;
import com.example.company.Dao.FoodInterface;
import com.example.company.model.FoodCart;
import com.example.company.model.food;

@Service
public class foodService {
 @Autowired
	FoodInterface foodie;
 @Autowired
 CartInterface cartfood;
 
 public List<food>allfood(food f)
 {
	 List<food> meal=foodie.findAll();
	return meal;
	 
 } 
 public food singlefood(int foodid)
 {
	 food meal=foodie.getById(foodid);
	 return meal;
 }
public FoodCart savefood(FoodCart c)
{
	FoodCart cart=cartfood.save(c);
	return cart;
}
public List<FoodCart>allorder(FoodCart f)
{
	List<FoodCart>meal=cartfood.findAll();
	return meal;
}
}
