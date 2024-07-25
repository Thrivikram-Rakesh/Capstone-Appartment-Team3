package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NavController {

	@GetMapping("/")
	public String Homepage() {
		return "index";
	}
	
	@GetMapping("/signup")
	public String Signup() {
		return "signup";
	}
	
	@GetMapping("/login")
	public String Login() {
		return "login";
	}
	
	@GetMapping("/errorlogin")
	public String Errorlogin() {
		return "errorlogin";
	}
	
	
	@GetMapping("/errorsignup")
	public String Errorsignup() {
		return "errorsignup";
	}
	
	@GetMapping("/admin")
	public String Admin() {
		return "admin";
	}
	
	@GetMapping("/user")
	public String User() {
		return "user";
	}
}
