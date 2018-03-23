package com.qrs.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qrs.springmvc.service.LoginService;

@Controller
public class HelloWorldController {
	
	@Autowired
	LoginService loginService;
	
	@RequestMapping("/hello")
	public String hello(Model model){
		model.addAttribute("greeting", "Hello Spring MVC");
		return "helloworld";
	}
	
	@RequestMapping("/login")
	public String login(Model model){
		loginService.login();
		return "login";
	}
}