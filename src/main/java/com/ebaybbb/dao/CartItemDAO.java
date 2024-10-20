package com.ebaybbb.dao;

import java.util.List;

import com.ebaybbb.dao.GenericDAO;
import com.ebaybbb.domain.CartItem;





public interface CartItemDAO extends GenericDAO<CartItem, Integer> {
  
	List<CartItem> findAll();
	






}


