package com.generics;

public class Generics {
	
	public static void findMaxInteger(Integer num1, Integer num2, Integer num3) {
		if(num1.compareTo(num2) > 0 && num1.compareTo(num3) > 0) {
			System.out.println("maximum number is : "+num1);
		}
		else if(num2.compareTo(num1) > 0 && num2.compareTo(num3) > 0) {
			System.out.println("maximum number is : "+num2);
		}
		else {
			System.out.println("Maximum number is : "+num3);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to generics");
		
		Generics.findMaxInteger(34, 54, 32);
	}	
}
