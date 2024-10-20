package com.ebaybbb.dao;

import java.util.List;

import com.ebaybbb.dao.GenericDAO;
import com.ebaybbb.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


