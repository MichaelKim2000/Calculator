package com.cimpa.git.calculus.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class AdditionTest {

	Addition act = new Addition();

	@Test
	public void testAction() {
		assertEquals(4,	act.action(2, 2));
		
	}

}
