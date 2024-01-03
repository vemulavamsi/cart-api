package com.ecommerce.ShoppingCart.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name = "user_account")
public class UserAccountEntity {

    @Id
    @Column(name = "username")
    private String username;

    @Column(name = "acc_password")
    private String accPassword;

    // Constructors, getters, and setters (if not using Lombok) go here
    
    // Getters and setters

    public String getUsername() {
        return username;
    }

    public UserAccountEntity() {
	}

	public UserAccountEntity(String username, String accPassword) {
		super();
		this.username = username;
		this.accPassword = accPassword;
	}

	public void setUsername(String username) {
        this.username = username;
    }

    public String getAccPassword() {
        return accPassword;
    }

    public void setAccPassword(String accPassword) {
        this.accPassword = accPassword;
    }
}

