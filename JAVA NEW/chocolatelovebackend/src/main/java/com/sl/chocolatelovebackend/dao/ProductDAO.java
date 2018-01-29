package com.sl.chocolatelovebackend.dao;

import java.util.List;

import com.sl.chocolatelovebackend.model.Product;

public interface ProductDAO 
{
	public boolean registerProduct( Product product);
	
	
	public List<Product> allProducts();
}
