package com.cimpa.calculustest.calculatortest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.cimpa.calculus.calculator.Addition;

public class TestAddition {

	Addition act = new Addition();

	@Test
	public void testAction() {
		assertEquals(4,	act.action(2, 2));				
	}
	
	@Test
	public void testAction_withZero() {
		assertEquals(2,	act.action(0, 2));				
	}

}
