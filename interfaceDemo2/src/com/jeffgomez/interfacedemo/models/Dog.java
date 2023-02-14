package com.jeffgomez.interfacedemo.models;

import com.jeffgomez.interfacedemo.interfaces.Keepable;

public class Dog extends Pets implements Keepable {

	public Dog() {
		super("random dog", "dog");
	}
	
	public Dog(String name) {
		super(name, "dog");
	}
	
	
	
	@Override
	public void showAffection() {
		System.out.println(" wagging tail");

	}

	@Override
	public void askForFood() {
		System.out.println(" whining");

	}

}