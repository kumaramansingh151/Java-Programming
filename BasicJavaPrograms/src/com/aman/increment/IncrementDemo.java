package com.aman.increment;

public class IncrementDemo {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;

		x = ++x; // it will 1st increase the value then assign to variable
		y = y++; // it will 1st assign the variable then increase the value

		System.out.print(x + " " + y);
	}

}
