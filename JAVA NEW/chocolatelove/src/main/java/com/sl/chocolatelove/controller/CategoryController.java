package com.sl.chocolatelove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sl.chocolatelovebackend.dao.*;
import com.sl.chocolatelovebackend.model.Category;


@Controller
public class CategoryController {
	
	@Autowired
	CategoryDAO categorydao;
	
	@RequestMapping("/catreg")
	public ModelAndView registerCategory()
	{
		
		ModelAndView mv=new ModelAndView("AddCategory");
		mv.addObject("categorySupportAgent", new Category());
		return mv;
	}
	
	
	@RequestMapping("/registercat")
	public String category(@ModelAttribute("categorySupportAgent") Category category)
	{
		System.out.println("hi im going register "+category.getCategoryName());
		if(categorydao.registerCategory(category))
		{
			return "index";
		}
		else
		{ 
			return "redirect:/catreg";
		}
	}

}
