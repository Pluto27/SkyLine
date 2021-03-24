package com.app.service;

import com.app.pojos.Booking;
import com.app.pojos.City;
import com.app.pojos.UserDetails;

public interface SkylineService {
	  
	UserDetails register(String name, String mobilenum, String email,String password);
	UserDetails login(String email,String password);
    UserDetails forgotPassword(String email, String password);
    City sourceName(String name);
    City destinationName( String name);
    Booking dateOfTravel(String date);
    

}
