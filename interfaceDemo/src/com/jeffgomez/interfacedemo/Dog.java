package com.jeffgomez.interfacedemo;

public class Dog extends Pets implements Keepable {

	public Dog() {
		super("random dog", "dog");
	}
	
	public Dog(String name) {
		super(name, "dog");
	}
	
	
	
	@Override
	public void showAffection() {
		System.out.println(this.name +  " is wagging tail");

	}

	@Override
	public void askForFood() {
		System.out.println(this.name + " is whining");

	}

}
