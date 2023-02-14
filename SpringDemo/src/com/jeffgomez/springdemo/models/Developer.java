package com.jeffgomez.springdemo.models;

import java.util.ArrayList;

public class Developer {
	
	 // attributes
    private static int devCount;
    private static int totalSalaries;
    private String name;
    private boolean employed;
    private int salary;
    private double hoursOfSleep;
    private ArrayList<String> languages;
   

    // constructor
    public Developer(){
        this.name = "no name yet";
        this.languages = new ArrayList<String>();
       
        devCount++;
    }

    public Developer(String name, boolean employed, int salary, double hoursOfSleep){
        this.name = name;
        this.employed = employed;
        this.salary = salary;
        this.hoursOfSleep = hoursOfSleep;
        this.languages = new ArrayList<String>();
        totalSalaries += this.salary;
        devCount++;
    }
    
    // methods
    public String displayStats(){
        String output = "name: " + this.name + "\n";
        output += "salary: " + this.salary + "\n";
        output += "empolyed: " + this.employed + "\n";
        output += "hours of sleep: " + this.hoursOfSleep + "\n";
        output += "languages: " + this.languages + "\n";
        output += "projects: \n";
        return output;
    }
    
	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isEmployed() {
		return employed;
	}

	public void setEmployed(boolean employed) {
		this.employed = employed;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		Developer.totalSalaries -= this.salary;
		Developer.totalSalaries += salary;
		this.salary = salary;
	}

	public double getHoursOfSleep() {
		return hoursOfSleep;
	}

	public void setHoursOfSleep(double hoursOfSleep) {
		this.hoursOfSleep = hoursOfSleep;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public static int getDevCount() {
		return devCount;
	}

	public static int getTotalSalaries() {
		return totalSalaries;
	}
    
    
    

    
}
