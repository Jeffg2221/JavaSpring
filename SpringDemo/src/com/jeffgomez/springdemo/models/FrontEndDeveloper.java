package com.jeffgomez.springdemo.models;

public class FrontEndDeveloper extends Developer {
	
	private boolean isArtistic;

	public FrontEndDeveloper() {
		super("No name givin",true,75000,6.5);
		this.isArtistic = true;
		// TODO Auto-generated constructor stub
	}
	public FrontEndDeveloper(String name) {
		super(name, true, 75000, 6.5);
		this.isArtistic = true;
		// TODO Auto-generated constructor stub
	}
	
	// Methods
	public String displayStats() {
		String output = super.displayStats();
		output+= "isArtistic: " + this.isArtistic + "\n";
		return output;
	}
	
	public void giveRaise(int amount) {
		this.setSalary(amount + this.getSalary());
		
	}
	
	
	
	
	//Getters and Setters
	
	public boolean isArtistic() {
		return isArtistic;
	}
	public void setArtistic(boolean isArtistic) {
		this.isArtistic = isArtistic;
	}
	

}
