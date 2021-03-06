package com.cimpa.calculus.calculator;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Baseline: adding two Integers with no modifications
 * @author mkim
 *
 */

public class Addition extends Calculate {
	Logger logger = LogManager.getLogger(Addition.class);
	
	@Override	
	public int action(int x, int y) {		
		logger.debug("parameters x and y: " + x + " and " + y);
		return x+y;
	}
}
