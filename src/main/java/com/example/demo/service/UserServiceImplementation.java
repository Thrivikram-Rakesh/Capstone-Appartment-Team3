package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {
	@Autowired
	UserRepository Urepo;
	
	@Override
	public String saveUser(User user) {
		Urepo.save(user);
		return null;
	}
	
	@Override
	public boolean EmailFound(String email) {
	if( Urepo.findByEmail(email)==null) {
		return false;
	}else {
		return true;
	}
	}

	@Override
	public String getpass(String email) {
		User user= Urepo.findByEmail(email);
		String password=user.getPassword();
		return password;
	}

	@Override
	public String getrole(String email) {
		User user=Urepo.findByEmail(email);
		return user.getRole();
	}

	@Override
	public List<User> getusers() {
		List<User> user=Urepo.findAll();
		return user;
	}

}
