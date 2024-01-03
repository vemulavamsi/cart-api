package com.ecommerce.ShoppingCart.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cart_items")
public class CartItemsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private Integer itemID;

    @Column(name = "item_name", length = 50)
    private String itemName;

    @Column(name = "price")
    private int price;

    @Column(name = "quantity_in_stock")
    private int quantityInStock;

    // Constructors, getters, and setters...

    public CartItemsEntity() {
    }

    public CartItemsEntity(String itemName, int price, int quantityInStock) {
        this.itemName = itemName;
        this.price = price;
        this.quantityInStock = quantityInStock;
    }

    // Getters and Setters...

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
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
        return "CartItemEntity{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", quantityInStock=" + quantityInStock +
                '}';
    }
}

