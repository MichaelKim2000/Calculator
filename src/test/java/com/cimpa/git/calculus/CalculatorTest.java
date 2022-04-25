package com.cimpa.git.calculus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cimpa.git.calculus.calculator.Addition;
import com.cimpa.git.calculus.calculator.Calculate;
import com.cimpa.git.calculus.calculator.Division;
import com.cimpa.git.calculus.calculator.Substraction;

class CalculatorTest {

	@Test
	void test() {

		Addition addNumbers = new Addition();
		Substraction subNumbers = new Substraction();
		Calculate divNumbers = new Division();

		assertAll("Should return good values for calculations", 
				() -> assertEquals(4, addNumbers.action(2, 2)),
				() -> assertEquals(0, subNumbers.action(2, 2)), 
				() -> assertEquals(1, divNumbers.action(2, 2))
		);

	}

}
