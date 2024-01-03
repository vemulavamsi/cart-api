package com.ecommerce.ShoppingCart.DTO;


public class CartItemDTO {
    private String itemName;
    private int price;
    private int quantityInStock;

    // Constructors, getters, and setters

    public CartItemDTO() {
    }

    public CartItemDTO(String itemName, int price, int quantityInStock) {
        this.itemName = itemName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(int quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    @Override
    public String toString() {
        return "CartItemDTO{" +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
	
}


