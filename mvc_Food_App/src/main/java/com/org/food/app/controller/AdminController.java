package com.org.food.app.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.food.app.dao.Admindao;
import com.org.food.app.dto.Admin;



@Controller
public class AdminController {

	@Autowired
	Admindao adminDao;

	@RequestMapping("/addadmin")
	public ModelAndView m1() {
		ModelAndView mav = new ModelAndView("adminloginform");
		Admin a = new Admin();
		a.setEmail("admin");
		a.setPassword("admin");

		adminDao.saveadmin(a);

		return mav;
	}

	@RequestMapping("/validate")
	public ModelAndView login(HttpServletRequest request) {

		String email = request.getParameter("email");
		String password = request.getParameter("password");

		Admin admin = adminDao.fetchAdminbyEmailandpassword(email, password);
		if(admin!=null) {
			ModelAndView mav = new ModelAndView("adminoptions.jsp");
			return mav ;
		}
		else {
			ModelAndView mav = new ModelAndView("adminloginform.jsp");
			mav.addObject("msg", "invalid credentials") ;
			return mav ;
		}

	}

}
