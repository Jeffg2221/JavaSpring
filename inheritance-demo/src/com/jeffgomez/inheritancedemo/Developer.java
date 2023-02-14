package com.jeffgomez.inheritancedemo;

import java.util.ArrayList;


public class Developer {
//	----------Attributes (private/protected) ---------
	private String name;
	private ArrayList<String> languages;
	private int salary;
	protected double hoursOfSleep;
	private static int devCount; //static : referring to the class, not the instance
	
	//  ---- constructors ---------
	public Developer() {
		this.name = "Anonymous Developer";
		this.languages = new ArrayList<String>();
		this.salary = 90000;
		this.hoursOfSleep = 4;
		devCount++;
	}
	
	public Developer(String name) {
		this.name = name;
		this.languages = new ArrayList<String>();
		this.salary = 90000;
		this.hoursOfSleep = 6;
		devCount++;
	}

	public Developer(String name, int salary, double hoursOfSleep) {
		this.name = name;
		this.salary = salary;
		this.hoursOfSleep = hoursOfSleep;
		this.languages = new ArrayList<String>();
		devCount++;
		
	}
	
	// -------- other methods -------
	public void displayStatus() {
		System.out.println("--------" +this.name+ "--------");
		System.out.println("Salary: " + this.salary);
		System.out.println("Hours of sleep: "+ this.hoursOfSleep);
		System.out.println("Language: " + this.languages);
	
		}
	
	
	public void addLanguage(String language) {
		this.languages.add(language);
	}
	
		
	
	

	// ------ getters & setters ---------
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<String> getLanguages() {
		return languages;
	}

	public void setLanguages(ArrayList<String> languages) {
		this.languages = languages;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public double getHoursOfSleep() {
		return hoursOfSleep;
	}

	public void setHoursOfSleep(double hoursOfSleep) {
		this.hoursOfSleep = hoursOfSleep;
	}

	public static int getDevCount() {
		return devCount;
	}

	public static void setDevCount(int devCount) {
		Developer.devCount = devCount;
	}
	
	
	
	
}
