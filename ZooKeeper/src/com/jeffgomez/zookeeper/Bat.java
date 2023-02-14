package com.jeffgomez.zookeeper;

public class Bat extends Mammal{
	
		
		public Bat() { 
		this.energyLevel = 300;
		
		}
	 
		public void fly() {
			 energyLevel -= 50;
			 System.out.println("Flap Flap Flap!");
			 super.displayEnergy();
		 }
		
		 
		public void eatHumans() {
			 energyLevel += 25;
			 System.out.println("Sooooooo this is awkward");
			 super.displayEnergy();
		 }
		
		 
		public void attackTown() {
			 energyLevel -= 100;
			 System.out.println("Burn Burn Burn!");
			 super.displayEnergy();
		 }
}
