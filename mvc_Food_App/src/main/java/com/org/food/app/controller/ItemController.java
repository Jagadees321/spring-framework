package com.org.food.app.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.food.app.dao.ProductDao;
import com.org.food.app.dto.FoodOrder;
import com.org.food.app.dto.Item;
import com.org.food.app.dto.Products;


@Controller
public class ItemController {

	@Autowired
	ProductDao dao;

	@RequestMapping("/additem")
	public ModelAndView additem(@RequestParam("id") int id) {
		ModelAndView mav = new ModelAndView("additem.jsp") ;
		Products product = dao.findProductById(id);
		Item item = new Item() ;
		item.setName(product.getName()) ;
		item.setCost(product.getCost()) ;
		
		mav.addObject("item", item) ; 
		
		return mav ;
	}
	
	@RequestMapping("/saveitem")
	public ModelAndView saveItem(@ModelAttribute("item") Item item,HttpSession session) {
		item.setCost(item.getQuality()*item.getCost()) ;
		FoodOrder order = (FoodOrder) session.getAttribute("foodorder") ;
		List<Item> items = order.getItem() ;
		item.setFoodorder(order) ;
		if(items!=null) {
			items.add(item) ;
			order.setItem(items) ;
			
		}
		else {
			List<Item> items1 = new ArrayList<Item>() ;
			items1.add(item) ;
			order.setItem(items1) ;
			
		}
		ModelAndView mav = new ModelAndView("redirect:/viewallproduct") ;
		
		return mav ;
	}
	
}
