package com.jeffgomez.interfacedemo;

import com.jeffgomez.interfacedemo.models.Cat;
import com.jeffgomez.interfacedemo.models.Dog;

public class InterfaceDemoApplication {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		
		cat1.askForFood();
		cat1.showAffection();
		cat1.displayStatus();
		
		Dog dog1 = new Dog("Cheif");
		dog1.askForFood();
		dog1.showAffection();
		dog1.displayStatus();
		// TODO Auto-generated method stub

	}

}
