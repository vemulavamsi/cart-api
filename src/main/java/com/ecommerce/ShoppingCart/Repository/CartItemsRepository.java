package com.ecommerce.ShoppingCart.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.ShoppingCart.Entity.CartItemsEntity;

@Repository
public interface CartItemsRepository extends JpaRepository<CartItemsEntity, Integer> {
    // You can add custom query methods here if needed

}

