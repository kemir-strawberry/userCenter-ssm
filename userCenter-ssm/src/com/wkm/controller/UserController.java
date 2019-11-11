package com.wkm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wkm.entity.User;
import com.wkm.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/user/{id}")
	public String userDetail(@PathVariable String id,Model model) {
		System.out.println("user:"+id + " login");
		User user = userService.getUserById(id);
		model.addAttribute("user",user);
		System.out.println(user);
		return "userDetail";
	}
}
