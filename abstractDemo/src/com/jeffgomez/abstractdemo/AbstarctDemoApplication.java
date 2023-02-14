package com.jeffgomez.abstractdemo;

import com.jeffgomez.abstractdemo.models.CashPayments;
import com.jeffgomez.abstractdemo.models.CreditCardPayment;

public class AbstarctDemoApplication {

	public static void main(String[] args) {
		//Payment pay = new Payment();
		CashPayments laptop = new CashPayments(1299.99);
		laptop.paymentDetails();
		// TODO Auto-generated method stub
		
		CreditCardPayment rp = new CreditCardPayment(100.00, "456241562", "Tyler Randall","02/65");
		rp.paymentDetails();
	}

}
