package com.jeffgomez.abstractdemo.abstracts;

public abstract class Payment {
	
	//attributes
	private double amount;

	public Payment(double amount) {
		this.amount = amount;
		// TODO Auto-generated constructor stub
	}
	
	public void paymentDetails() {
		System.out.println("Payment amount: " + this.amount);
	}

	
	//getters and setters
	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

}
