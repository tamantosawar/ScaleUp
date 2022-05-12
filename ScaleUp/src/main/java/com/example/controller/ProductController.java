package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Product;
import com.example.repo.ProductRepository;
import com.example.services.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
		
	@RequestMapping(value="/product" )
	public ModelAndView home() {
	    List<Product> listProduct = productService.listAll();
	    ModelAndView mav = new ModelAndView("product");
	    mav.addObject("listProduct", listProduct);
	    return mav;
	}
	
	@RequestMapping(value="/new")
	public String newProductForm(Map<String, Object> model) {
	    Product product = new Product();
	    model.put("product", product);
	      return "newProduct";
	}
	@RequestMapping(value = "/save")
	public String saveProduct(@ModelAttribute("product") Product product) {
	    productService.save(product);
	    return "redirect:/product";
	}
	
	@RequestMapping(value="/edit")
	public ModelAndView editProductForm(@RequestParam long id) {
	    ModelAndView mav = new ModelAndView("editProduct");
	    Product product = productService.get(id);
	    mav.addObject("product", product);
	    return mav;
	}
	
	@RequestMapping("/delete")
	public String deleteProductForm(@RequestParam long id) {
	    productService.delete(id);
	    return "redirect:/product";       
	}
	
	@RequestMapping("/search")
	public ModelAndView search(@RequestParam String keyword) {
	    List<Product> result = productService.search(keyword);
	    ModelAndView mav = new ModelAndView("search");
	    mav.addObject("result", result);
	    return mav;    
	}
}
