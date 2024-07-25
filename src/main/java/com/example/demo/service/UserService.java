package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.User;

public interface UserService {
	
	public String saveUser(User user);
	public boolean EmailFound(String email);
	public String getpass(String email);
	public String getrole(String email);
	public List<User> getusers();

}
