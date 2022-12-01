package com.ashokit.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.entity.Item;

public interface ItemRepository  extends JpaRepository<Item,Serializable> {

}
