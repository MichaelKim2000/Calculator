package com.cimpa.calculustest.calculatortest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.cimpa.calculus.calculator.Substraction;

class TestSubstraction {
	Substraction act = new Substraction();

	@Test
	void testAction() {
		assertEquals(0, act.action(2, 2));
	}
	
	@Test
	void testActionWithZero() {
		assertEquals(0, act.action(0, 0));
	}

}
