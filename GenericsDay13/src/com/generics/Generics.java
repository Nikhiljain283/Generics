package com.generics;

public class Generics {
	
	public static <E extends Comparable> void findMax(E num1, E num2, E num3) {
		if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
			System.out.println("maximum is : "+num1);
		}
		else if(num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
			System.out.println("maximum is : "+num2);
		}
		else {
			System.out.println("Maximum is : "+num3);
		}
	}
	

	public static void main(String[] args) {
		System.out.println("Welcome to generics");
		
		Generics.findMax(34, 54, 32);
		Generics.findMax(36.4f, 45.6f, 74.6f);
		Generics.findMax("red", "yellow", "blue");
	}	
}
