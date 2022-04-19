package com.cimpa.git.calculus.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.cimpa.git.calculus.calculator.Addition;

class AdditionTest {

	Addition act = new Addition();

	@Test
	void testAction() {
		assertEquals(4, act.action(2, 2));
	}

}
