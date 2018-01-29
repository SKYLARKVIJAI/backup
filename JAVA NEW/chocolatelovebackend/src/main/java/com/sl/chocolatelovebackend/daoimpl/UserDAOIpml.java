package com.sl.chocolatelovebackend.daoimpl;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sl.chocolatelovebackend.dao.UserDAO;
import com.sl.chocolatelovebackend.model.UserRegistration;

@Repository
public class UserDAOIpml implements UserDAO {

	@Autowired
	SessionFactory sessionFactory;
	public boolean registerUser(UserRegistration userRegistration) {
		// TODO Auto-generated method stub
		try {
			
			Session s=sessionFactory.openSession();
			Transaction tx=s.beginTransaction();
			s.save(userRegistration);
			tx.commit();
			s.close();
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
 
}
