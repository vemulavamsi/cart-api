package com.ecommerce.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ecommerce.ShoppingCart.Entity.UserAccountEntity;

public interface UserAccountsRepository extends JpaRepository<UserAccountEntity, String> 
{ 

}
