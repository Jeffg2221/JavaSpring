package com.careSoft.clinicapp;
import java.util.Date;
import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPPACompliantUser {
//... imports class definition...
    
    // Inside class:    
    private ArrayList<String> patientNotes;
	
    // TO DO: Constructor that takes an ID
  
	
    public Physician(int i) {
		// TODO Auto-generated constructor stub
	}


	public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
            "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }
    // TO DO: Implement HIPAACompliantUser!
    
	
	public void setPatientNotes(ArrayList<String> patientNotes) {
		this.patientNotes = patientNotes;
	}


	public boolean accessAuthorized(int i) {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean assignPin(int i) {
		// TODO Auto-generated method stub
		return false;
	}
	
  
	
}
