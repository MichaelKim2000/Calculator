package com.cimpa.git.calculus.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.cimpa.git.calculus.calculator.Substraction;

class SubstractionTest {
	Substraction act = new Substraction();

	@Test
	void testAction() {
		assertEquals(0, act.action(2, 2));
	}

}
