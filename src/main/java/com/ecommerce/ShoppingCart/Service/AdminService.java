package com.ecommerce.ShoppingCart.Service;

import org.springframework.stereotype.Service;

@Service
public interface AdminService {
	
	public Integer verifyLogin(String username, String password);
	public Integer signupUser(String username, String password);

}
