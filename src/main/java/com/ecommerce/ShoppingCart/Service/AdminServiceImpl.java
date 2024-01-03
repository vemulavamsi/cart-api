package com.ecommerce.ShoppingCart.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.ShoppingCart.Entity.UserAccountEntity;
import com.ecommerce.ShoppingCart.Repository.UserAccountsRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	UserAccountsRepository userAccountsRepository;

	@Override
	public Integer verifyLogin(String username, String password) {
		
		
		Optional<UserAccountEntity> account = userAccountsRepository.findById(username);
		
		
		if(account.isPresent())
		{
			UserAccountEntity accountInfo = account.get();
			return (accountInfo.getUsername().equals(username)&& accountInfo.getAccPassword().equals(password)) ? 1 : 0;
		}
		
		return 0;
		
		
		
	}

	@Override
	public Integer signupUser(String username, String password) {
		
		
		UserAccountEntity newAccount = new UserAccountEntity();
		newAccount.setUsername(username);
		newAccount.setAccPassword(password);
		userAccountsRepository.save(newAccount);
		return 1;
	}
	
	
	
}
