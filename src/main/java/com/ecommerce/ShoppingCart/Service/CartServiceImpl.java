package com.ecommerce.ShoppingCart.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ShoppingCart.DTO.CartItemDTO;
import com.ecommerce.ShoppingCart.Entity.CartItemsEntity;
import com.ecommerce.ShoppingCart.Repository.CartItemsRepository;

@Service
public class CartServiceImpl implements CartService {
	
	
	
	@Autowired
	CartItemsRepository cartItemsRepository;

	@Override
	public CartItemsEntity createRecord(CartItemDTO newItem) {
		
		CartItemsEntity newEntity = new CartItemsEntity();
		newEntity.setItemName(newItem.getItemName());
		newEntity.setPrice(newItem.getPrice());
		newEntity.setQuantityInStock(newItem.getQuantityInStock());
		cartItemsRepository.save(newEntity);
		return newEntity;
	}

	@Override
	public List<CartItemsEntity> fetchRecords() {
		 return cartItemsRepository.findAll();
	}
	
	@Override
	public Integer updateRecord(Integer itemID,CartItemDTO updateItem) {
		Optional<CartItemsEntity> cartItem = cartItemsRepository.findById(itemID);
		
		CartItemsEntity itemWithID = (cartItem.isPresent()) ? cartItem.get(): null;
		
		if(null != itemWithID)
		{
			itemWithID.setItemID(itemID);
			itemWithID.setItemName(updateItem.getItemName());
			itemWithID.setPrice(updateItem.getPrice());
			itemWithID.setQuantityInStock(updateItem.getQuantityInStock());
		}
		cartItemsRepository.save(itemWithID);
		return 1;
		
	}
	
	@Override
	public Integer deleteRecord(Integer itemID) {
		Optional<CartItemsEntity> cartItem = cartItemsRepository.findById(itemID);
		
		CartItemsEntity itemWithID = (cartItem.isPresent()) ? cartItem.get(): null;
		cartItemsRepository.delete(itemWithID);
		return 1;
		
	}

}
