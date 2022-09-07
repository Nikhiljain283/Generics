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
	
	public static void findMaxFloat(Float num1, Float num2, Float num3) {
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
	
	public static void findMaxString(String str1, String str2, String str3) {
		if(str1.compareTo(str2) > 0 && str1.compareTo(str3) > 0) {
			System.out.println("maximum string is : "+str1);
		}
		else if(str2.compareTo(str1) > 0 && str2.compareTo(str3) > 0) {
			System.out.println("maximum string is : "+str2);
		}
		else {
			System.out.println("Maximum string is : "+str3);
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to generics");
		
		Generics.findMaxInteger(34, 54, 32);
		Generics.findMaxFloat(36.4f, 45.6f, 74.6f);
		Generics.findMaxString("red", "yellow", "blue");
	}	
}
