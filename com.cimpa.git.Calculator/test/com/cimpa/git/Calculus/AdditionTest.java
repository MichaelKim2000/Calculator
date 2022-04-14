package com.cimpa.git.Calculus;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class AdditionTest {

	Addition act = new Addition();

	@Test
	void testAction() {
		assertEquals(4, act.action(2, 2));
	}

}
