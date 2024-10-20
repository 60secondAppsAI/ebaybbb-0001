package com.ebaybbb.dao;

import java.util.List;

import com.ebaybbb.dao.GenericDAO;
import com.ebaybbb.domain.Auction;





public interface AuctionDAO extends GenericDAO<Auction, Integer> {
  
	List<Auction> findAll();
	






}


