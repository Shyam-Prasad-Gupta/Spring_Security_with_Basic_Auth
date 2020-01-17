package com.shyam.springboot.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LoginController {
	
	@RequestMapping(name = "/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.addAttribute("company_name", "BlahBlah.com");
		
		return "welcome";
	}

}
