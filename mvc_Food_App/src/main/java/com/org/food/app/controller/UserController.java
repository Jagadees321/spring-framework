package com.org.food.app.controller;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.food.app.dao.UserDao;
import com.org.food.app.dto.User;



@Controller
public class UserController {

	@Autowired
	UserDao dao;

	@RequestMapping("/adduser")
	public ModelAndView addUser() {
		ModelAndView mav = new ModelAndView("adduserform.jsp");
		User u = new User();
		mav.addObject("user", u);
		return mav;
	}

	@RequestMapping("/saveuser")
	public ModelAndView saveUser(@ModelAttribute("user") User u) {
		ModelAndView mav = new ModelAndView("adminoptions.jsp");
		dao.saveUser(u);
		mav.addObject("message", "user saved successfully");
		return mav;
	}
	
	@RequestMapping("/validateuser")
	public ModelAndView loginUser(HttpServletRequest request) {
		String email = request.getParameter("email") ;
		String password = request.getParameter("password") ;
		User user = dao.findUserByEmailAndPassword(email, password) ;
		if(user!=null) {
			ModelAndView mav = new ModelAndView("useroptions.jsp") ;
			HttpSession hs = request.getSession() ;
			hs.setAttribute("user", user) ;
			return mav ;
		}
		else {
			ModelAndView mav = new ModelAndView("userloginform.jsp") ;
			mav.addObject("message", "invalid credentials") ;
			return mav ;
		}
	}

}
