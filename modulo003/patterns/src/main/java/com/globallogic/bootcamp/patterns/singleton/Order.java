package com.globallogic.bootcamp.patterns.singleton;

public class Order {
	private String description;
	private double count;
	private Currency currency;
	
	public Order(String description, double count, Currency currency) {
		this.description = description;
		this.count = count;
		this.currency = currency;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getCount() {
		return count;
	}
	public void setCount(double count) {
		this.count = count;
	}
	public Currency getCurrency() {
		return currency;
	}
	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
	
	
}
