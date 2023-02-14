package com.jeffgomez.abstractdemo.models;

import com.jeffgomez.abstractdemo.abstracts.Payment;

public class CreditCardPayment extends Payment {
	
	private String cardNum, ownerName,expDate;

	public CreditCardPayment(double amount, String cardNum, String ownerName, String expDate) {
		super(amount);
		this.cardNum = cardNum;
		this.ownerName = ownerName;
		this.expDate = expDate;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void paymentDetails() {
		super.paymentDetails();
		System.out.println("CardNum: " + this.cardNum + " | owner: " + this.ownerName + " | expDate: " + this.expDate );
		
	}

}
