package com.ebaybbb.dao;

import java.util.List;

import com.ebaybbb.dao.GenericDAO;
import com.ebaybbb.domain.Cart;





public interface CartDAO extends GenericDAO<Cart, Integer> {
  
	List<Cart> findAll();
	






}


