package com.jeffgomez.zookeeper;

public class Mammal {
	public int energyLevel = 100;
	
	public int displayEnergy() {
		System.out.println("Energy Level " + energyLevel);
		return energyLevel;
	}
}
