package com.cimpa.git.calculus.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cimpa.git.calculus.calculator.Division;

class DivisionTest {

	Division act = new Division();
	
	@Test
	void testAction() {
		assertEquals(3, act.action(4, 2));
	}

}
