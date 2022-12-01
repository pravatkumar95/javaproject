package com.ashokit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.Order;
import com.ashokit.repository.ItemRepository;
import com.ashokit.repository.OrderRepository;

@Service
public class OrderServiceImpl  implements IOrderServiceMgmt {
	
	@Autowired
	private OrderRepository orderRepo;
	@Autowired
	private ItemRepository itemRepo;

	@Override
	public String createNewOrder(List<Order>  listOrder) {
		
		for(Order order : listOrder) {
			
			  orderRepo.save(order);
			
			
		}
		return "Order save sucessfully";
		
	}

	@Override
	public Order getOrderById(Integer id) {
		
		Optional<Order>  listOrder=orderRepo.findById(id);
		   Order order =listOrder.get();
		   return order;
	}

	@Override
	public List<Order> getAllOrder() {
		 
		List<Order> order=orderRepo.findAll();
		return order;
	}

}
