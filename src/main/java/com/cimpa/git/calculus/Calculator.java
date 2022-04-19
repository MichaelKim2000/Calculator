package com.cimpa.git.calculus;

import com.cimpa.git.calculus.calculator.Addition;
import com.cimpa.git.calculus.calculator.Calculate;
import com.cimpa.git.calculus.calculator.Division;
import com.cimpa.git.calculus.calculator.Substraction;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Hello Calculator! 2 and 2 is...");	
		
		Calculator calc = new Calculator();		
		
		System.out.println("add : " + calc.calculate(new Addition(),2,2));
		System.out.println("sub : " + calc.calculate(new Substraction(),2,2));
		System.out.println("div : " + calc.calculate(new Division(),2,2));			
	}

	public int calculate(Calculate c, int i, int j) {
		return c.action(i, j);		
	}

}
