package com.mysite.banjjak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	
	@GetMapping("/member")
	public String member() {
		return "user/member";
	}
	
	@PostMapping("/member")
	public String memberForm() {
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
