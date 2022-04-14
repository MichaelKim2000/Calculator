package com.cimpa.git.Calculus;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello Calculator! 2");
		
		Addition addNumbers = new Addition();
		Substraction subNumbers = new Substraction();
		Division divNumbers = new Division();
		
		
		System.out.println("2+2 is: " + addNumbers.add(2,2));
		System.out.println("2-2 is: " + subNumbers.sub(2,2));
		System.out.println("2/2 is: " + divNumbers.div(2,2));

	}

}
