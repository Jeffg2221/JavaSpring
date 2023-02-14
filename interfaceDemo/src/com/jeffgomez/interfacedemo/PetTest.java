package com.jeffgomez.interfacedemo;

public class PetTest {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		
		cat1.askForFood();
		cat1.showAffection();
		cat1.displayStatus();
		
		Dog dog1 = new Dog("Cheif");
		dog1.askForFood();
		dog1.showAffection();
		dog1.displayStatus();
	}

}
