package com.cimpa.git.calculus.calculator;

/**
 * Baseline: adding two Integers with no modifications
 * @author mkim
 *
 */

public class Addition extends Calculate {
	@Override
	public int action(int x, int y) {
		// TODO: replace with log4J
		System.out.println("addition action");
		return x+y;
	}
}
