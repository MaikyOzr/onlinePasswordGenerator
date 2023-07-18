package com.roma.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.roma.demo.service.WebService;

@Controller
public class WebController {

	private WebService webService = new WebService();
	
	@GetMapping("/")
	public String main(String password, Model model) {
		password = webService.generatePassword();
		model.addAttribute("password",password);
		return "main";
	}
}
