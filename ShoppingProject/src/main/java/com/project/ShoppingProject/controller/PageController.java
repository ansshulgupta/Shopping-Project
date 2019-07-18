package com.project.ShoppingProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.project.ShoppingProjectBackend.dao.CategoryDAO;
import com.project.ShoppingProjectBackend.dto.Category;

@Controller
public class PageController {

	@Autowired
	private CategoryDAO categoryDAO;

	@RequestMapping(value = { "/", "/home", "/index" })
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("page");
		// mv.addObject("greeting", "welcome to spring web mvc");
		mv.addObject("userClickHome", true);

		// passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("title", "Home");
		return mv;
	}

	@RequestMapping(value = { "/about" })
	public ModelAndView about() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickAbout", true);
		mv.addObject("title", "About Us");

		return mv;
	}

	@RequestMapping(value = { "/contact" })
	public ModelAndView contact() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("userClickContact", true);
		mv.addObject("title", "Contact Us");

		return mv;
	}

	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts() {
		ModelAndView mv = new ModelAndView("page");
		
		mv.addObject("title", "All Products");
		
		// passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		mv.addObject("userClickAllProducts", true);

		return mv;
	}
	
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id) {
		ModelAndView mv = new ModelAndView("page");
		
		//categoryDAO to fetch a single category
		
		Category category = null;
		
		 category = categoryDAO.get(id);
	
		mv.addObject("title", category.getName());
		
		// passing the list of categories
		mv.addObject("categories", categoryDAO.list());
		
		//passing the single category obj.
		
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts", true);

		return mv;
	}
	
	
		
	
	
	
	
	
	/*
	 * @RequestMapping("/test") public ModelAndView
	 * test(@RequestParam(value="greeting", required=false) String greeting) {
	 * if(greeting==null) { greeting="hellow world"; }
	 * 
	 * ModelAndView mv = new ModelAndView("page"); mv.addObject("greeting",
	 * greeting); return mv; }
	 * 
	 * @RequestMapping("/test/{greeting}") public ModelAndView
	 * test(@PathVariable("greeting")String greeting) { ModelAndView mv = new
	 * ModelAndView("page"); mv.addObject("greeting", greeting); return mv; }
	 */

}
