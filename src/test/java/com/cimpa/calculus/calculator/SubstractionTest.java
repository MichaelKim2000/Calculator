package com.cimpa.calculus.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SubstractionTest {
	Logger logger = LogManager.getLogger(SubstractionTest.class);
	Substraction act = new Substraction();

	@Test
	public void testAction() {
		logger.debug("test 2-2");
		assertEquals(0, act.action(2, 2));
	}
	
	@Test
	public void testActionWithZero() {
		logger.debug("test 2-0");
		assertEquals(2, act.action(2, 0));
	}

}
