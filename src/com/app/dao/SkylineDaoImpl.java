package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Booking;
import com.app.pojos.City;
import com.app.pojos.UserDetails;

@Repository
public class SkylineDaoImpl implements SkylineDaoInterface {
	
	@Autowired
	private SessionFactory sf;

	@Override
	public UserDetails register(String name, String mobilenum, String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetails login(String email, String password) {
		// TODO Auto-generated method stub
		String jpql = "select s from UserDetails s where s.email=:em and s.password=:pa";
		return sf.getCurrentSession().createQuery(jpql, UserDetails.class).setParameter("em", email).setParameter("pa", password)
				.getSingleResult();
	}

	
	 @Override 
	 public UserDetails forgotPassword(String email, String password) {
		 String jpql = "update s from UserDetails s SET s.password=:pa where s.email=:em ";
	   return  sf.getCurrentSession().createQuery(jpql, UserDetails.class).setParameter("pa", password)
				.getSingleResult(); }
	  
//	  @Override public City sourceName(String name) { // TODO Auto-generated method
//	  stubjjjjj return null; }
//	  
//	  @Override public City destinationName(String name) { // TODO Auto-generated
//	  method stub return null; }
//	  
//	  @Override public Booking dateOfTravel(String date) { // TODO Auto-generated
//	  method stub return null; }
//	 /

}
