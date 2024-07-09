package com.example.company.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.company.Dao.UserInterface;
import com.example.company.model.User;

@Service
public class UserService {
	@Autowired
	UserInterface repo;
	User user=new User();
	
	public User saveuser(User user)
	{
	     User k=repo.save(user);	
		return k;		
	}
	
	public User loginUser(int password)
	 {
		User k=repo.getById(password);
		return k;
	 }

}
