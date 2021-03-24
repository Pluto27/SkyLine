package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.UserDetails;
import com.app.service.SkylineService;

@Controller
@RequestMapping("/userdetails")
public class UserDetailsController {
	
	@Autowired
	private SkylineService service;
	
	public UserDetailsController()
	{
	   System.out.println("in user controller constructor" +getClass().getName());
	
		
	}
	
	@GetMapping("/login")
	public String Userlogin()
	{
       System.out.println("show user login form");
       return "/userdetails/login";

	}
	@PostMapping("/login") // =@RequestMapping + method=post
	public String processLoginForm(Model map, 
			@RequestParam String email,
			@RequestParam String password,
			HttpSession hs) {
		System.out.println("in process login form");
		try {
			UserDetails ud= service.login(email, password);
			map.addAttribute("status", "Login SUcess....");
			hs.setAttribute("user_dtls", ud);
			System.out.println("Login success");
			return "redirect:/userdetails/login";
		} catch (RuntimeException e) {
			System.out.println("err in user controller " + e);
			// invalid login
			// add err message as model attribute ---req scope
			map.addAttribute("status", "Invalid Login , Pls retry!!!!");
			return "/userdetails/login";
		}
	}
		@GetMapping("/forgotpassword")
		public String forgotpasswordform()
		{
			System.out.println("show forgot password form");
			return "/userdetails/forgotpassword";
			
		}
		@PostMapping("/forgotpassword")
		public String processforgotpassword(Model map, 
				@RequestParam String email,
				@RequestParam String password,
				HttpSession hs) {
			    System.out.println("in process forgot password");
			    try {
			    	UserDetails ud1 = service.forgotPassword(email, password);
			    	map.addAttribute("status", "forgot password SUcess....");
					hs.setAttribute("user_dtls", ud1);
					System.out.println("forgot password success");
					return "redirect:/userdetails/forgotpassword";
			    } catch (RuntimeException e) {
					System.out.println("err in user controller " + e);
					// invalid password
					// add err message as model attribute ---req scope
					map.addAttribute("status", "Invalid password , Pls retry!!!!");
					return "/userdetails/forgotpassword";
				}
			    
			    
		}
		}
			
			
		
	