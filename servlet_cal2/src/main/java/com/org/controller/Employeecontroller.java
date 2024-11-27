package com.org.controller;

import java.util.List;


import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.dao.Empdao;
import com.org.dto.Employee;

@Controller
public class Employeecontroller {
	
	@RequestMapping("/jj")
	public ModelAndView saveEmployee(@ModelAttribute Employee e) {
		ModelAndView mav= new ModelAndView("Home.jsp");
		System.out.println(e);
		boolean res=Empdao.saveemp(e);
		if(res) {
			mav.addObject("msg","data saved succuessly");
		}
		else {
			mav.addObject("msg","not added");
		}
		return mav;
	}
	@RequestMapping("/get")
	public ModelAndView getemp(HttpSession hs) {
		ModelAndView mav=new ModelAndView("display.jsp");
		List<Employee> emp=Empdao.getallemployees();
		mav.addObject("empp", emp);
		hs.setAttribute("emp", emp);
		
		return mav;
	}
	@RequestMapping("/delete")
	public ModelAndView deleteemp(@RequestParam int id) {
		ModelAndView mav=new ModelAndView("get");
		boolean res=Empdao.deleteemp(id);
		if(res) {
			mav.addObject("msg","data deleted successfully");
		}
		
		return mav;
		
	}
	
	@RequestMapping("/edit")
	public ModelAndView editemp(@RequestParam int id) {
		Employee e=Empdao.findbyid(id);
		ModelAndView mav=new ModelAndView("update.jsp");
		mav.addObject("emp",e);
		return mav;
		
	}

	
	@RequestMapping("/update")
	public ModelAndView updateemp(@ModelAttribute Employee e){
		
		Empdao.updateemp(e);
		ModelAndView mav=new ModelAndView("get");
		mav.addObject("msg","data updated successfully");
		return mav;
		
	}
	
	
	
	

}
