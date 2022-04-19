package com.cimpa.git.calculus.calculator;

import org.junit.platform.suite.api.ExcludePackages;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;


//@SelectPackages({"com.cimpa.git.calculus.calculator.AdditionTest" 	})
@SelectPackages({"com.cimpa.git.calculus" })
//@ExcludePackages("com.cimpa.git.calculus.calculator")
@Suite
@SuiteDisplayName("Calculator Action Tests")

public class CalculatorTestSuite {


}
