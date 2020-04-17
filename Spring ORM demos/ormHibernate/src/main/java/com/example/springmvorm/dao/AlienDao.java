package com.example.springmvorm.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.springmvcorm.models.Alien;



@Component
public class AlienDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Alien> getAlien(){
		System.out.println("Inside getAliens method in DAO...");
		Session session = sessionFactory.getCurrentSession();
		System.out.println(session.createQuery("from alien", Alien.class).getQueryString());
		List<Alien> aliens = session.createQuery("from alien",Alien.class).list();
		System.out.println("the list is"+aliens);
		return aliens;
	}

}
