package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Orders;
import com.example.services.OrderService;


@Controller
public class OrderController {

	@Autowired
	private OrderService orderService;
		
	@RequestMapping(value="/orders" )
	public ModelAndView home() {
	    List<Orders> listOrders = orderService.listAll();
	    ModelAndView mav = new ModelAndView("orders");
	    mav.addObject("listOrders", listOrders);
	    return mav;
	}
	
	@RequestMapping(value="/updateOrder")
	public ModelAndView editOrderForm(@RequestParam int id) {
	    ModelAndView mav = new ModelAndView("Orders");
	    Orders orders = orderService.get(id);
	    mav.addObject("orders", orders);
	    return mav;
	}
	@RequestMapping("/deleteOrders")
	public String deleteProductForm(@RequestParam int id) {
		orderService.delete(id);
	    return "redirect:/orders";       
	}
	
}
