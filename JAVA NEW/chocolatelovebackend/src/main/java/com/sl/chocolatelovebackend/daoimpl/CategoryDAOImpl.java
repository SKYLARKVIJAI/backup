package com.sl.chocolatelovebackend.daoimpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sl.chocolatelovebackend.dao.CategoryDAO;
import com.sl.chocolatelovebackend.model.Category;

@Repository
public class CategoryDAOImpl implements CategoryDAO {

		@Autowired
		SessionFactory sessionFactory;
		
		public boolean registerCategory(Category categoryRegistration) {
			// TODO Auto-generated method stub
			try {
				
				Session s=sessionFactory.openSession();
				Transaction tx=s.beginTransaction();
				s.save(categoryRegistration);
				tx.commit();
				s.close();
				return true;
			} catch (Exception e) {
				// TODO: handle exception
				return false;
			}
		}
		
	 
	}


