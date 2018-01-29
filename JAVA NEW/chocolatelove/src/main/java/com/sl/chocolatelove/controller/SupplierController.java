package com.sl.chocolatelove.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sl.chocolatelovebackend.dao.ProductDAO;
import com.sl.chocolatelovebackend.dao.SupplierDAO;

import com.sl.chocolatelovebackend.model.Product;
import com.sl.chocolatelovebackend.model.Supplier;
import com.sl.chocolatelovebackend.model.UserRegistration;


@Controller
public class SupplierController {
	
	@Autowired
	SupplierDAO prodao;
	
	@RequestMapping("/supplier")
	public ModelAndView product()
	{
		ModelAndView mv=new ModelAndView("supplier");
		mv.addObject("supplierAgent", new Supplier());
		mv.addObject("supplist", prodao.allSupplier());
		return mv;
	}

	
	@RequestMapping("/registersupplier")
	public String userRegister(@ModelAttribute("supplierAgent") Supplier supplier)
	{
		System.out.println("hi im going register "+supplier.getSupplierName());
		if(prodao.registerSupplier(supplier))
		{
			return "redirect:/supplier";
		}	
		else
		{
			return "redirect:/index";
		}
	}
}
