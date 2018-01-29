package com.sl.chocolatelovebackend.daoimpl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sl.chocolatelovebackend.dao.ProductDAO;
import com.sl.chocolatelovebackend.dao.ProductDAO;
import com.sl.chocolatelovebackend.model.Product;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	SessionFactory sessionFactory;

	public boolean registerProduct(Product product) {
		// TODO Auto-generated method stub
		try {
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			s.save(product);
			tx.commit();
			s.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}

	public List<Product> allProducts() {
		// TODO Auto-generated method stub
		List<Product> allProduct=null;
		try {
			Session s = sessionFactory.openSession();
			Transaction tx = s.beginTransaction();
			allProduct=s.createQuery("FROM Product").list();
			tx.commit();
			s.close();
			return allProduct;
		} catch (Exception e) {
			// TODO: handle exception
			return allProduct;
		}
	}
}
