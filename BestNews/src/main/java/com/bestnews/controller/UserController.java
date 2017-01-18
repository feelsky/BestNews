package com.bestnews.controller;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bestnews.model.User;

@Controller
@RequestMapping("/user")
public class UserController {
	private List<User> users = new ArrayList<User>();
	
	public UserController(){
		users.add(new User("sdy","123","松动","aaa"));
		users.add(new User("sdy1","1231","松动1","aaa2"));
		users.add(new User("sdy2","1232","松动2","aaa3"));
		users.add(new User("sdy3","1233","松动3","aaa4"));
		users.add(new User("sdy4","1234","松动4","aaa5"));
	}
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
	public String list(Model model){
		model.addAttribute("users",users);
		return "user/list.ftl";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String add(Model model){
		model.addAttribute(new User());
		return "user/add.ftl";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String add(User user){
		users.add(user);
		return "redirect:/user/list";
	}
	
}
