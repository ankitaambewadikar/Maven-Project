package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.app.myCalculator.MyCalculator;

public class TestDivisionCalculator {

	private MyCalculator divide;
	@Test
	public void divideTwoPositiveNumbers() {
		
		divide = new MyCalculator();
		int division = divide.divideTwoNumbers(10,2);
		assertEquals(5, division);
	}
	@Test
	public void divideTwoNegativeNumbers() {
		
		divide = new MyCalculator();
		int division = divide.divideTwoNumbers(-10,-2);
		assertEquals(5, division);
	}
	@Test
	public void divideOnePositiveOneNegative() {
		
		divide = new MyCalculator();
		int division = divide.divideTwoNumbers(10,-2);
		assertEquals(-5, division);
	}

}
