package com.sl.chocolatelovebackend.dao;

import java.util.List;

import com.sl.chocolatelovebackend.model.Supplier;

public interface  SupplierDAO 
{
	public boolean registerSupplier( Supplier supplier);
	
	
	public List<Supplier> allSupplier();
}
