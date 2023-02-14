package com.jeffgomez.springdemo;

import java.util.ArrayList;

import com.jeffgomez.springdemo.models.Developer;
import com.jeffgomez.springdemo.models.FrontEndDeveloper;

public class DeveloperTest {

	public static void main(String[] args) {
		 System.out.println("---------Developer Test---------");

	        Developer dev1 = new Developer("Radyn Greenwell",true,100000,5.2);
	        FrontEndDeveloper fed = new FrontEndDeveloper("Goku Son");

	        ArrayList<String> lang = new ArrayList<String>();
	        lang.add("Java");
	        lang.add("Python");

	        fed.setLanguages(lang);
	        fed.giveRaise(25000);


	        System.out.println(fed.displayStats());
	        System.out.println(Developer.getDevCount());
	        System.out.println(Developer.getTotalSalaries());
	    }
		// TODO Auto-generated method stub

	

}
