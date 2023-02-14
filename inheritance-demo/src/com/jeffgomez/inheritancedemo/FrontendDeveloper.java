package com.jeffgomez.inheritancedemo;

public class FrontendDeveloper extends Developer {

	private boolean isArtistic;
		
	public FrontendDeveloper() {
		super("Anonymous Frontend Developer");
		this.setSalary(100000); // if variable is private you need to use set
		this.hoursOfSleep = 7; // variable of superclass is protected
		this.isArtistic = false;
		
		
	}
	
	public FrontendDeveloper(String name) {
		super(name);
		this.isArtistic = true;
		this.setSalary(super.getSalary() + 20000);
	}
	
	public void displayStatus() {
		super.displayStatus();
		System.out.println("Is artistic? " + this.isArtistic);
	}

	public void raiseSalary(int raise) {
		this.setSalary(getSalary() + raise);
	}
	
	public boolean isArtistic() {
		return isArtistic;
	}

	public void setArtistic(boolean isArtistic) {
		this.isArtistic = isArtistic;
	}
	
	
}
