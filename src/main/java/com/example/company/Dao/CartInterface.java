package com.example.company.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.company.model.FoodCart;

public interface CartInterface extends JpaRepository<FoodCart, Integer> {

}
