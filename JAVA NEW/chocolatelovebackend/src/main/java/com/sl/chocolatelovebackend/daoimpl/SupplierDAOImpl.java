package com.sl.chocolatelovebackend.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sl.chocolatelovebackend.dao.CategoryDAO;
import com.sl.chocolatelovebackend.dao.SupplierDAO;
import com.sl.chocolatelovebackend.model.Category;
import com.sl.chocolatelovebackend.model.Product;
import com.sl.chocolatelovebackend.model.Supplier;

@Repository
public class SupplierDAOImpl implements SupplierDAO {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public boolean registerSupplier(Supplier supplierRegistration) {
		// TODO Auto-generated method stub
		try {
			Session s=sessionFactory.openSession();
			Transaction tx=s.beginTransaction();
			s.save(supplierRegistration);
			tx.commit();
			s.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	
	
	}

	public List<Supplier> allSupplier() {
		// TODO Auto-generated method stub
		List<Supplier> allSupplier=null;
		try {
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			allSupplier=s.createQuery("FROM Supplier").list();
			tx.commit();
			s.close();
			return allSupplier;
		} catch (Exception e) {
			// TODO: handle exception
			return allSupplier;

	}
	}

	

	
}