package com.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.shopping.service.ShoppingService;

@SpringBootApplication
public class ShoppingApp {

	public static void main(String[] args) {
	    ApplicationContext ctx = SpringApplication.run(ShoppingApp.class, args);
		ctx.getBean(ShoppingService.class).displayCartInfo();
	}
}
