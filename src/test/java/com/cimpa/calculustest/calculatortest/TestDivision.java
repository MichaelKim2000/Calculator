package com.cimpa.calculustest.calculatortest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.cimpa.calculus.calculator.Division;

class TestDivision {

	Division act = new Division();
	
	@Test
	void testAction() {
		assertEquals(1, act.action(2, 2));
	}
	
	@Test
	@DisplayName("Testing NullPointerException")
	void testActionDivByZero() {
		Exception exc = assertThrows(ArithmeticException.class, () -> act.action(2, 0));
		assertEquals("/ by zero",exc.getMessage());
	}

}
