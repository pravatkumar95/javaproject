package com.ashokit.service;

import java.util.List;

import com.ashokit.entity.Order;

public interface IOrderServiceMgmt {
	
	public  String  createNewOrder(List<Order> order);
	public  Order getOrderById(Integer id);
	public  List<Order>  getAllOrder();
	

}
