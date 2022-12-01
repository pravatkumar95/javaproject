package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashokit.entity.Order;
import com.ashokit.service.IOrderServiceMgmt;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private IOrderServiceMgmt  orderService;
	
	@PostMapping("/create")
	public String createOrder(List<Order>  order) {
		
		String  message=orderService.createNewOrder(order);
		return message;
		
		
	}
	
	@GetMapping("{order_id}")
	public  Order getOrder(@PathVariable Integer order_id) {
		
		  Order order= orderService.getOrderById(order_id);
		
		   return order;
	}
	
	@GetMapping("/getAllOrder")
	public List<Order>  getAllOrder(){
		
		List<Order> order=orderService.getAllOrder();
		return order;
	}

}
