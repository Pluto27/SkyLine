package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.SkylineDaoInterface;
import com.app.pojos.Booking;
import com.app.pojos.City;
import com.app.pojos.UserDetails;

@Service 
@Transactional
public class SkylineServiceimpl implements SkylineService {
	
	@Autowired
	private SkylineDaoInterface dao;
	
	public UserDetails register(String name, String mobilenum,
			String email,String password)
	{
		return dao.register(name, mobilenum, email, password);
	}
	
	public UserDetails login(String email,String password)
	{
		return dao.login(email, password);
	}

	@Override
	public UserDetails forgotPassword(String email, String password) {
		// TODO Auto-generated method stub
		return dao.forgotPassword(email, password);
	}

	@Override
	public City sourceName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public City destinationName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Booking dateOfTravel(String date) {
		// TODO Auto-generated method stub
		return null;
	}
	
           
}
