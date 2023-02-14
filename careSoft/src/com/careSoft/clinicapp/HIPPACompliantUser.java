package com.careSoft.clinicapp;

public interface HIPPACompliantUser {
	
	public interface HIPAACompliantUser {
	    abstract boolean assignPin(int pin);
	    abstract boolean accessAuthorized(Integer confirmedAuthID);
	}

}
