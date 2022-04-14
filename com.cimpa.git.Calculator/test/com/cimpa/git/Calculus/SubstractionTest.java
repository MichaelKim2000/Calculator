package com.cimpa.git.Calculus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SubstractionTest {
	Substraction act = new Substraction();

	@Test
	void testAction() {
		assertEquals(0, act.action(2, 2));
	}

}
