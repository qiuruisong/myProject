package com.qrs.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.qrs.springmvc.bean.User;
import com.qrs.springmvc.service.LoginService;
import com.qrs.springmvc.tools.CommonUtils;

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
	public String login(@RequestParam("name") String name,@RequestParam("pwd") String pwd){
		User user = new User(CommonUtils.getUUid(), name, pwd, 12, 1, 1);
		loginService.login(user);
		return "index";
	}
}