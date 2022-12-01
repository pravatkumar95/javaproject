package com.ashokit.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Order  implements Serializable{
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer orderId;
	private Date orderDate;
	private String orderStatus;
	@OneToMany(targetEntity = Item.class,cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name = "IDORDER",referencedColumnName = "orderId")
	private  List<Item> item;
	@Override
	public String toString() {
		return "Order [oId=" + orderId + ", orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", item=" + item
				+ "]";
	}
	
	
	
	
	
	
	
	
	

}
