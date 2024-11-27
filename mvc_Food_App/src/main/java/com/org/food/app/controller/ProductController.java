package com.org.food.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.org.food.app.dao.ProductDao;
import com.org.food.app.dto.Products;


@Controller
public class ProductController {
	
	@Autowired
	ProductDao dao ;

	@RequestMapping("/addproduct")
	public ModelAndView addProduct() {
		ModelAndView mav = new ModelAndView("addproduct");
		Products product = new Products() ;
		mav.addObject("product", product);
		return mav;
	}

	
	@RequestMapping("/saveproducts")
	public ModelAndView saveproduct(@ModelAttribute("product") Products p) {
		ModelAndView mav = new  ModelAndView("adminoptions.jsp") ;
			dao.saveProduct(p) ;
			return mav ;
	}
	
	@RequestMapping("/viewallproducts")
	public ModelAndView viewAllProducts() {
		ModelAndView mav = new ModelAndView("allproducts.jsp") ;
		List<Products> products = dao.fetchAllProducts() ;
		mav.addObject("productlist", products) ;
		return mav ;
	}
	
	@RequestMapping("/update")
	public ModelAndView update(@RequestParam("id") int id) {
		ModelAndView mav = new ModelAndView("updateproduct") ;
		Products product =  dao.findProductById(id) ;
		mav.addObject("productinfo", product) ;
		return mav ;
	}

	@RequestMapping("/updateproduct")
	public ModelAndView updateProduct(@ModelAttribute("productinfo") Products product) {
		ModelAndView mav = new ModelAndView("adminoptions") ;
		dao.updateProduct(product) ;
		return mav ;

	}
	
	@RequestMapping("/delete")
	public ModelAndView deleteProduct(@RequestParam("id") int id) {
		ModelAndView mav = new ModelAndView("redirect:/viewallproducts") ;
	
		dao.deleteProductById(id) ;
		return mav ;
	}
	
	@RequestMapping("/viewallproduct")
	public ModelAndView viewAllProduct() {
		ModelAndView mav = new ModelAndView("displayallproducts") ;
		List<Products> products = dao.fetchAllProducts() ;
		mav.addObject("productlist", products) ;
		return mav ;
	}
}
