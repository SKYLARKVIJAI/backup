package com.sl.chocolatelove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sl.chocolatelovebackend.dao.ProductDAO;
import com.sl.chocolatelovebackend.dao.SupplierDAO;

import com.sl.chocolatelovebackend.model.Product;
import com.sl.chocolatelovebackend.model.UserRegistration;


@Controller
public class ProductController {
	
	@Autowired
	ProductDAO prodao;
	
	@RequestMapping("/product")
	public ModelAndView product()
	{
		ModelAndView mv=new ModelAndView("product");
		mv.addObject("productAgent", new Product());
		mv.addObject("prodlist", prodao.allProducts());
		return mv;
	}

	
	@RequestMapping("/registerproduct")
	public String userRegister(@ModelAttribute("productAgent") Product product)
	{
		System.out.println("hi im going register "+product.getProductName());
		if(prodao.registerProduct(product))
		{
			return "redirect:/product";
		}
		else
		{
			return "redirect:/product";
		}
	}
}
