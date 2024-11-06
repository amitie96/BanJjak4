package com.mysite.banjjak.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mysite.banjjak.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@GetMapping("/join")
	public String member() {
		return "user/join";
	}
	
	@PostMapping("/join")
	public String memberForm() {
		userService.join();
		return "redirect:/user/login";
	}

	@GetMapping("/login")
	public String login() {
		return "user/login";
	}

	@PostMapping("/login")
	public String  loginForm(Model model) {
		return "redirect:/main";
	}
}
