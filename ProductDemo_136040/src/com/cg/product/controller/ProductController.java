package com.cg.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cg.product.bean.Product;
import com.cg.product.service.IProductService;


@Controller
public class ProductController {

	@Autowired
	IProductService service;

	@RequestMapping("showHomePage")
	public String showHomePage() {
		System.out.println("hello");
		return "index";
	}
	
	@RequestMapping("op")
	public ModelAndView retrieve(@RequestParam("id") String id){
		System.out.println("hellot");
		Product product = service.retrieveProduct(id);
		ModelAndView mvc = new ModelAndView();
		
		
			mvc.addObject("Product",product);
			mvc.setViewName("retrieveForm");
		
			
		return mvc;				
	}
	
	@RequestMapping("opAll")
	public String retrieveAll(Model model){
		List<Product> productList = service.retrieveAllProducts();
		model.addAttribute("productList",productList);
		return "retrieveAll";				
	}

}
