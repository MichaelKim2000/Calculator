package com.cimpa.git.calculustest.calculatortest;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.cimpa.git.calculus.calculator.Addition;

public class TestAddition {

	Addition act = new Addition();

	@Test
	public void testAction() {
		assertEquals(5,	act.action(2, 2));		// force error		
	}
	
	@Test
	public void testAction_withZero() {
		assertEquals(2,	act.action(0, 2));				
	}

}
