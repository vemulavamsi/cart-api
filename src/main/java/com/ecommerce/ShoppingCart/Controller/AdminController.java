package com.ecommerce.ShoppingCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.ShoppingCart.Service.AdminService;

@RestController
@CrossOrigin
@RequestMapping("/Cart/admin")
public class AdminController {
	
	
	@Autowired
	AdminService adminService;
	
	@GetMapping("/login")
	public Integer login(@RequestParam String username,@RequestParam String password)
	{
		return adminService.verifyLogin(username, password);
		
	}
	
	@GetMapping("/signup")
	public Integer signup(@RequestParam String username,@RequestParam String password)
	{
		return adminService.signupUser(username, password);
		
	}

}
