package com.cimpa.git.calculus.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class AdditionTest {

	Addition act = new Addition();

	@Test
	public void testAction() {
		assertEquals(4,	act.action(2, 2));				
	}
	
	@Test
	public void testAction_withZero() {
		assertEquals(3,	act.action(0, 2));				
	}

}
