package com.jeffgomez.interfacedemo.interfaces;

public interface Keepable {
	//default means usable
	public default void play() {
		System.out.println("Playing.....");
	}
	// Contracts for our classes that implement this keepable interface to fill out the body of the method.
	// abstract means it has to be completed  when the interface is implemented
	abstract void showAffection();
	abstract void askForFood();
}

