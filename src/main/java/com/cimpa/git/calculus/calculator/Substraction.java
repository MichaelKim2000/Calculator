package com.cimpa.git.calculus.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Substraction extends Calculate {
	Logger logger = LogManager.getLogger(Addition.class);
	@Override
	public int action(int x, int y) {
		logger.debug("parameters x and y: " + x + " and " + y);
		return x-y;
	}
}
