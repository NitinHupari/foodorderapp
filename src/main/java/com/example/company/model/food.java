package com.example.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class food {
	@Id
	int foodid;
	String foodname;
	double foodprice;
	String foodimage;
	
	public food() {
		
	}
	public int getFoodid() {
		return foodid;
	}
	public void setFoodid(int foodid) {
		this.foodid = foodid;
	}
	public String getFoodname() {
		return foodname;
	}
	public void setFoodname(String foodname) {
		this.foodname = foodname;
	}
	public double getFoodprice() {
		return foodprice;
	}
	public void setFoodprice(double foodprice) {
		this.foodprice = foodprice;
	}
	public String getFoodimage() {
		return foodimage;
	}
	public void setFoodimage(String foodimage) {
		this.foodimage = foodimage;
	}
	@Override
	public String toString() {
		return "food [foodid=" + foodid + ", foodname=" + foodname + ", foodprice=" + foodprice + ", foodimage="
				+ foodimage + "]";
	}
	public food(int foodid, String foodname, double foodprice, String foodimage) {
		super();
		this.foodid = foodid;
		this.foodname = foodname;
		this.foodprice = foodprice;
		this.foodimage = foodimage;
	}
	
	
}
