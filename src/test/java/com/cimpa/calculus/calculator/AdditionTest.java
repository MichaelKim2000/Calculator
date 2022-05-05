package com.cimpa.calculus.calculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import com.cimpa.calculus.calculator.Addition;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AdditionTest {
	Logger logger = LogManager.getLogger(AdditionTest.class);
	Addition act = new Addition();	

	@Test
	public void testAction() {
		logger.debug("test 2+2");
		assertEquals(4,	act.action(2, 2));				
	}
	
	@Test
	public void testAction_withZero() {
		logger.debug("test 0+2");
		assertEquals(2,	act.action(0, 2));				
	}

}
