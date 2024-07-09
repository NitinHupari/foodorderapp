package com.example.company.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.company.model.User;

@Repository
public interface UserInterface extends JpaRepository<User,Integer> {

}
