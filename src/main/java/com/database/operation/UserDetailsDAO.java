package com.database.operation;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.application.util.HibernateUtil;
import com.views.model.User;
import com.views.model.User_details;

public class UserDetailsDAO extends HibernateDaoSupport {

	public void save(User user) {
		//getHibernateTemplate.save(user_details);
	}
	
	public static void main(String[] args){
		System.out.println("Hibernate intialize");
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
		User user=new User();
		user.setID(121);
		user.setName("Hibernate");
		session.save(user);
		session.getTransaction().commit();
	}
}
