package com.jeffgomez.interfacedemo.models;

import com.jeffgomez.interfacedemo.interfaces.Keepable;

public class Cat extends Pets implements Keepable {

	public Cat() {
		super("random cat", "cat");
	}
	
	
	public Cat(String name) {
		super(name, "cat");
	}
	
	public void showAffection() {
		System.out.println("Biting you at midnight");
	}
	
	public void askForFood() {
		System.out.println("Meowwwwwwwww");
	}
}
