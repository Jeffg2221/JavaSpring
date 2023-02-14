package com.jeffgomez.interfacedemo;

public class Pets {
	//attributes
	protected String name;
	protected String type;
	
	//constructor
	public Pets() {
		this.name = "random pet";
	}
	
	public Pets(String name) {
		this.name = name;
	}
	
	public Pets(String name, String type) {
		this.name = name;
		this.type = type;
	}
	
	// other methods
	 public void displayStatus() {
		 System.out.println("Name: " + this.name);
		 System.out.println("Type: " + this.type);
	 }
	

	
	// getters/setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	
		
}
