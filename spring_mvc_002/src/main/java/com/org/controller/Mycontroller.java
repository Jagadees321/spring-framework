package com.org.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.Regdao;
import com.org.dto.Register;

@Controller
public class Mycontroller {
	@RequestMapping("/save")
	public static ModelAndView savereg(@ModelAttribute Register r) {
		
		ModelAndView mav=new ModelAndView("registerview.jsp");
		boolean res=Regdao.saveemp(r);
		if(res) {
			mav.addObject("msg", "data added successfully");
		}
		else {
			mav.addObject("msg", "data not added successfully");
		}
		return mav;
	}
	@RequestMapping("/get")
	public String getreg(HttpSession hs) {
		List<Register> li=Regdao.regview();
		hs.setAttribute("reg", li);
		return "regdisplay.jsp";
	}

}
