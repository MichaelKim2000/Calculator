package com.cimpa.git.calculus.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class DivisionTest {

	Division act = new Division();
	
	@Test
	void testAction() {
		assertEquals(1, act.action(2, 2));
	}

}
