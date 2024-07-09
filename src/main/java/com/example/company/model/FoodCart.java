package com.example.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
/*
@Entity
public class FoodCart extends food {
	@Id
	int cartid;
	int quantity;
	
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public FoodCart(int foodid, String foodname, double foodprice, String foodimage, int cartid, int quantity) {
		super(foodid, foodname, foodprice, foodimage);
		this.cartid = cartid;
		this.quantity = quantity;
	}
	
	public FoodCart() {
		
	}
}*/
import jakarta.persistence.OneToOne;

@Entity
public class FoodCart {
	@Id
	int cartid;
	int quantity;
	@OneToOne
	food eat;
		
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public food getEat() {
		return eat;
	}
	public void setEat(food eat) {
		this.eat = eat;
	}

	public FoodCart(int cartid, int quantity, food eat) {
		super();
		this.cartid = cartid;
		this.quantity = quantity;
	   this.eat = eat;
	
	}
	
    public FoodCart()
    {
    	
    }
	@Override
	public String toString() {
		return "FoodCart [cartid=" + cartid + ", quantity=" + quantity + ", eat=" + eat + "]";
	}
	

}
