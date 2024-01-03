package com.ecommerce.ShoppingCart.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ecommerce.ShoppingCart.DTO.CartItemDTO;
import com.ecommerce.ShoppingCart.Entity.CartItemsEntity;

@Service
public interface CartService {
	
	public CartItemsEntity createRecord(CartItemDTO newItem);
	public List<CartItemsEntity> fetchRecords();
	public Integer updateRecord(Integer itemID, CartItemDTO updateItem);
	Integer deleteRecord(Integer itemID);

}
