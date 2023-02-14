package com.jeffgomez.zookeeper;

public class Gorilla extends Mammal {
	 
	public void throwSomething() {
		 energyLevel -= 5;
		 System.out.println("The Gorilla has thrown an object at you!");
		 displayEnergy();
	 }
	
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The Gorilla has eaten a banana and is very happy!");
		displayEnergy();
	}
	
	public void climb() {
		energyLevel -= 10 ;
		System.out.println("The Gorilla has climbed a tree and lost some energy.");
		displayEnergy();
	}
}
