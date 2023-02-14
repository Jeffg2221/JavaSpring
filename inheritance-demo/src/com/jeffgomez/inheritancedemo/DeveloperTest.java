package com.jeffgomez.inheritancedemo;

public class DeveloperTest {

	public static void main(String[] args) {
		System.out.println("---- Developer Test ------");
		Developer dev1 = new Developer("Alex Miller", 100000, 6);
		dev1.addLanguage("Python");
		dev1.addLanguage("Java");
		dev1.displayStatus();
		
		Developer dev2 = new Developer();
		dev2.displayStatus();
		
		FrontendDeveloper dev3 = new FrontendDeveloper();
		dev3.displayStatus();
		
		FrontendDeveloper dev4 = new FrontendDeveloper("Jeff Gomez");
		dev4.raiseSalary(100000);
		dev4.displayStatus();
		
		BackendDeveloper dev5 = new BackendDeveloper();
		dev5.displayStatus();

	}

}
