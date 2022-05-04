package com.cimpa.calculus;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.cimpa.calculus.calculator.Addition;
import com.cimpa.calculus.calculator.Calculate;
import com.cimpa.calculus.calculator.Division;
import com.cimpa.calculus.calculator.Substraction;

public class Calculator {
	
	private static final Logger logger = LogManager.getLogger(Calculator.class);
	
	public static void main(String[] args) {			
		
		logger.info("Hello Calculator! 2 and 2 is...");			
		
		Calculator calc = new Calculator();		
		
		logger.info("add : " + calc.calculate(new Addition(),2,2));
		logger.info("sub : " + calc.calculate(new Substraction(),2,2));
		logger.info("div : " + calc.calculate(new Division(),2,2));			
	}

	public int calculate(Calculate c, int i, int j) {
		return c.action(i, j);		
	}

}
