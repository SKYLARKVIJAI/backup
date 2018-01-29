package com.sl.chocolatelove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sl.chocolatelovebackend.dao.UserDAO;
import com.sl.chocolatelovebackend.model.UserRegistration;

@Controller
public class UserController {
	
	@Autowired
	UserDAO userdao;
	
	@RequestMapping("/reg")
	public ModelAndView register()
	{
		
		ModelAndView mv=new ModelAndView("signup");
		mv.addObject("userSupportAgent", new UserRegistration());
		return mv;
	}

	@RequestMapping("/registeruser")
	public String userRegister(@ModelAttribute("userSupportAgent") UserRegistration userRegistration)
	{
		System.out.println("hi im going register "+userRegistration.getUsername());
		if(userdao.registerUser(userRegistration))
		{
			return "redirect:/index";
		}
		else
		{
			return "redirect:/reg";
		}
	}
}
