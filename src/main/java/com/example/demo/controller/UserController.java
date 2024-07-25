package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService Userv;
	@PostMapping("/addUser")
	public String addUser(@ModelAttribute User user){
		boolean email=Userv.EmailFound(user.getEmail());
		if(email==true) {
			return "errorsignup";
		}else {
			Userv.saveUser(user);
			return "login";
		}
		
	}
	
	@PostMapping("/validate")
	public String validate(@ModelAttribute User user) {
		boolean email=Userv.EmailFound(user.getEmail());
		String password=user.getPassword();
		if(email==false) {
			return "errorlogin";
		}else {
			if(password.equals(Userv.getpass(user.getEmail()))) {

				String role=Userv.getrole(user.getEmail());
				if(role.equals("Admin")) {
					return "admin";
				}else {
					return "user";
				}
				
			}else {
				return "login";
			}
		}
	}
	
	@GetMapping("/getusers")
	public List<User> getUsers() {
		return Userv.getusers();
	}
}
