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

	public static <E extends Comparable> void findMax(E[] inputArr) {
		E temp;
		for (int i = 0; i < inputArr.length; i++) {
			for (int j = i + 1; j < inputArr.length; j++) {
				if (inputArr[i].compareTo(inputArr[j]) > 0) {
					temp = inputArr[i];
					inputArr[i] = inputArr[j];
					inputArr[j] = temp;
				}
			}
		}
		System.out.println("Maximum is : " + inputArr[inputArr.length - 1]);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to generics");

		Integer[] intArr = { 45, 65, 48, 75, 98 };
		Float[] floatArr = { 54.6f, 45.3f, 84.5f, 25.9f, 78.1f };
		String[] strArr = { "red", "yellow", "blue", "green", "orange" };
		Generics.findMax(intArr);
		Generics.findMax(floatArr);
	}
}
