package com.shopping.config;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
@ConfigurationProperties(prefix = "cart")
public class ShoppingCartProperties {
	private String user;
    private double totalAmount;

    private int[] quantities;
    private List<String> items;
    private Set<String> coupons;
    private Map<String, Integer> prices;
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public int[] getQuantities() {
		return quantities;
	}
	public void setQuantities(int[] quantities) {
		this.quantities = quantities;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	public Set<String> getCoupons() {
		return coupons;
	}
	public void setCoupons(Set<String> coupons) {
		this.coupons = coupons;
	}
	public Map<String, Integer> getPrices() {
		return prices;
	}
	public void setPrices(Map<String, Integer> prices) {
		this.prices = prices;
	}
}
