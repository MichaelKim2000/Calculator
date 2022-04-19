package com.cimpa.git.calculus.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class DivisionTest {

	Division act = new Division();
	
	@Test
	public void testAction() {
		assertEquals(1,	act.action(2, 2));
		
	}
}
