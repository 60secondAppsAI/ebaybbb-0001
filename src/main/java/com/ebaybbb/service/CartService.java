package com.ebaybbb.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.ebaybbb.domain.Cart;
import com.ebaybbb.dto.CartDTO;
import com.ebaybbb.dto.CartSearchDTO;
import com.ebaybbb.dto.CartPageDTO;
import com.ebaybbb.dto.CartConvertCriteriaDTO;
import com.ebaybbb.service.GenericService;
import com.ebaybbb.dto.common.RequestDTO;
import com.ebaybbb.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface CartService extends GenericService<Cart, Integer> {

	List<Cart> findAll();

	ResultDTO addCart(CartDTO cartDTO, RequestDTO requestDTO);

	ResultDTO updateCart(CartDTO cartDTO, RequestDTO requestDTO);

    Page<Cart> getAllCarts(Pageable pageable);

    Page<Cart> getAllCarts(Specification<Cart> spec, Pageable pageable);

	ResponseEntity<CartPageDTO> getCarts(CartSearchDTO cartSearchDTO);
	
	List<CartDTO> convertCartsToCartDTOs(List<Cart> carts, CartConvertCriteriaDTO convertCriteria);

	CartDTO getCartDTOById(Integer cartId);







}





