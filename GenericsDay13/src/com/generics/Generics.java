package com.generics;

public class Generics<T extends Comparable> {

	T firstInput;
	T secondInput;
	T thirdInput;

	Generics(T firstInput, T secondInput, T thirdInput) {
		this.firstInput = firstInput;
		this.secondInput = secondInput;
		this.thirdInput = thirdInput;
	}

	public void findMax() {
		Generics.findMax(firstInput, secondInput, thirdInput);
	}

	public static <E extends Comparable> void findMax(E firstInput, E secondInput, E thirdInput) {
		if (firstInput.compareTo(secondInput) > 0 && firstInput.compareTo(thirdInput) > 0) {
			System.out.println("maximum is : " + firstInput);
		} else if (secondInput.compareTo(firstInput) > 0 && secondInput.compareTo(thirdInput) > 0) {
			System.out.println("maximum is : " + secondInput);
		} else {
			System.out.println("Maximum is : " + thirdInput);
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to generics");

		new Generics("cat", "mat", "rat").findMax();
		new Generics(46, 98, 42).findMax();
		new Generics(5.6f, 4.5f, 7.4f).findMax();
		Generics.findMax(36.4f, 45.6f, 74.6f);
		Generics.findMax("red", "yellow", "blue");
	}
}
