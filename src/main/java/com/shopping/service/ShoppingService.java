package com.shopping.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.config.ShoppingCartProperties;

@Service
public class ShoppingService {
	@Autowired
	private ShoppingCartProperties shoppingCartProperties;
	
	public void displayCartInfo() {

        System.out.println("\n============== Shopping Cart =================");
        System.out.println("User            : " + shoppingCartProperties.getUser());
        System.out.println("Total Amount    : " + shoppingCartProperties.getTotalAmount());

        System.out.print("\nItem Quantities : ");
        for (int q : shoppingCartProperties.getQuantities()) {
            System.out.print(q + " ");
        }

        System.out.println("\nItems     : " + shoppingCartProperties.getItems());
        System.out.println("Coupons     : " + shoppingCartProperties.getCoupons());

        System.out.println("Prices      : ");
        shoppingCartProperties.getPrices().forEach((k, v) -> System.out.println("   " + k + " = " + v));
    }
}
