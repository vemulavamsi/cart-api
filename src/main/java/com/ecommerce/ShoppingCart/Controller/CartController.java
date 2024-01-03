package com.ecommerce.ShoppingCart.Controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.ecommerce.ShoppingCart.DTO.CartItemDTO;
import com.ecommerce.ShoppingCart.Entity.CartItemsEntity;
import com.ecommerce.ShoppingCart.Service.CartService;

@RestController
@CrossOrigin
@RequestMapping("/cartManage")
public class CartController {
	
	
	@Autowired
	CartService cartService;

	@PostMapping("/create")
	public CartItemsEntity createRecord(@RequestBody CartItemDTO newItem)
	{
		return cartService.createRecord(newItem);
		
	}
	
	@GetMapping("/fetch")
	public List<CartItemsEntity> fetchRecord()
	{
		return cartService.fetchRecords();
		
	}
	
	
	@GetMapping("/update/{itemID}")
	public Integer updateRecord(@PathVariable Integer itemID,
		    @RequestParam String itemName,
		    @RequestParam Integer price,
		    @RequestParam Integer quantityInStock)
	{
		CartItemDTO updateItem = new CartItemDTO();
	    updateItem.setItemName(itemName);
	    updateItem.setPrice(price);
	    updateItem.setQuantityInStock(quantityInStock);
		
		return cartService.updateRecord(itemID, updateItem);
		
	}
	
	
	@GetMapping("/delete/{itemID}")
	public Integer deleteRecord(@PathVariable Integer itemID)
	{
		return cartService.deleteRecord(itemID);
		
	}

}
