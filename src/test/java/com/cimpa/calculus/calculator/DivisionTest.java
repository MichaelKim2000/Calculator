package com.cimpa.calculus.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DivisionTest {

	Division act = new Division();
	
	@Test
	public void testAction() {		
		assertEquals(1, act.action(2, 2));
	}
	
	@Test
	@DisplayName("Testing NullPointerException")
	public void testActionDivByZero() {
		Exception exc = assertThrows(ArithmeticException.class, () -> act.action(2, 0));
		assertEquals("/ by zero",exc.getMessage());
	}

}
