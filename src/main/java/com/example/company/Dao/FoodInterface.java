package com.example.company.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.company.model.food;
@Repository
public interface FoodInterface extends JpaRepository<food,Integer>{

	

}
