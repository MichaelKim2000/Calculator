package com.cimpa.git.calculus;

import com.cimpa.git.calculus.calculator.Addition;
import com.cimpa.git.calculus.calculator.Calculate;
import com.cimpa.git.calculus.calculator.Division;
import com.cimpa.git.calculus.calculator.Substraction;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello Calculator! 2");			
		
				
		Addition addNumbers = new Addition();
		Substraction subNumbers = new Substraction();
		Calculate divNumbers = new Division();		
		
		System.out.println("2+2 is: " + addNumbers.action(2,2));
		System.out.println("2-2 is: " + subNumbers.action(2,2));
		System.out.println("2/2 is: " + divNumbers.action(2,2));

	}

}
