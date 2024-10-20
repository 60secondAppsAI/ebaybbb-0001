package com.ebaybbb.dao;

import java.util.List;

import com.ebaybbb.dao.GenericDAO;
import com.ebaybbb.domain.Category;





public interface CategoryDAO extends GenericDAO<Category, Integer> {
  
	List<Category> findAll();
	






}


