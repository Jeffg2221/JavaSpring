package com.careSoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class AdminUser extends User implements HIPPACompliantUser, HIPPACompliantAdmin {
	
//... imports class definition...
    
    // Inside class:
    private Integer employeeID;
    private String role;
    private ArrayList<String> securityIncidents;
    
    // TO DO: Implement a constructor that takes an ID and a role
    
    // TO DO: Implement HIPAACompliantUser!
    
   
    
    public AdminUser(int i, String string) {
		// TODO Auto-generated constructor stub
	}
	public void newIncident(String notes) {
        String report = String.format(
            "Datetime Submitted: %s \n,  Reported By ID: %s\n Notes: %s \n", 
            new Date(), this.id, notes
        );
        securityIncidents.add(report);
    }
    public void authIncident() {
        String report = String.format(
            "Datetime Submitted: %s \n,  ID: %s\n Notes: %s \n", 
            new Date(), this.id, "AUTHORIZATION ATTEMPT FAILED FOR THIS USER"
        );
        securityIncidents.add(report);
    }
    
    // TO DO: Implement HIPAACompliantAdmin!
    
	@Override
	public ArrayList<String> reportSecurityIncidents() {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void printSecurityIncidents() {
		// TODO Auto-generated method stub
		HIPPACompliantAdmin.super.printSecurityIncidents();
	}
	@Override
	public boolean adminQATest(ArrayList<String> expectedIncidents) {
		// TODO Auto-generated method stub
		return HIPPACompliantAdmin.super.adminQATest(expectedIncidents);
	}
	
	
	// TO DO: Setters & Getters
	public Integer getEmployeeID() {
		return employeeID;
	}
	public void setEmployeeID(Integer employeeID) {
		this.employeeID = employeeID;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public ArrayList<String> getSecurityIncidents() {
		return securityIncidents;
	}
	public void setSecurityIncidents(ArrayList<String> securityIncidents) {
		this.securityIncidents = securityIncidents;
	}
	public boolean accessAuthorized(int i) {
		return false;
		// TODO Auto-generated method stub
		
	}
	public boolean assignPin(int i) {
		// TODO Auto-generated method stub
		return false;
	}
    
    
	
}
