package com.example.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class checkout {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	int orderid;
    int userid;
    int quantity;
    String date;
    @OneToOne
    food spice;
    
	public checkout() {
		
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public food getSpice() {
		return spice;
	}
	public void setSpice(food spice) {
		this.spice = spice;
	}
	@Override
	public String toString() {
		return "checkout [orderid=" + orderid + ", userid=" + userid + ", quantity=" + quantity + ", date=" + date
				+ ", spice=" + spice + "]";
	}
	public checkout(int orderid, int userid, int quantity, String date, food spice) {
		super();
		this.orderid = orderid;
		this.userid = userid;
		this.quantity = quantity;
		this.date = date;
		this.spice = spice;
	}
}
