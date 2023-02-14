package com.jeffgomez.test;

import java.util.ArrayList;

public class Developer {

	
//	----------Attributes (private/protected) ---------
	private String name;
	private ArrayList<String> languages;
	private ArrayList<Project> projects;
	private int salary;
	private double hoursOfSleep;
	
	private static int devCount; //static : referring to the class, not the instance
	private static int totalIncome; // Store all the beginning salary
	private static int totalProjects;
	
	public Developer() {
		
	}
	
	public Developer(String name, int salary, double hoursOfSleep) {
		this.name = name;
		this.salary = salary;
		this.hoursOfSleep = hoursOfSleep;
	}
	
	public void displayStatus() {
		System.out.println("Name: " +this.name);
		System.out.println("Slary: " + this.salary);
		System.out.println("Hours of sleep: "+ this.hoursOfSleep);
	
		}
		
		
		
	

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

	public ArrayList<Project> getProjects() {
		return projects;
	}

	public void setProjects(ArrayList<Project> projects) {
		this.projects = projects;
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

	public static int getTotalIncome() {
		return totalIncome;
	}

	public static void setTotalIncome(int totalIncome) {
		Developer.totalIncome = totalIncome;
	}

	public static int getTotalProjects() {
		return totalProjects;
	}

	public static void setTotalProjects(int totalProjects) {
		Developer.totalProjects = totalProjects;
	} 
	
	

}
