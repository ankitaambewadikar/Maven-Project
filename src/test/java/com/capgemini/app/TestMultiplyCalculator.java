package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.app.myCalculator.MyCalculator;

public class TestMultiplyCalculator {
	private MyCalculator multiply;

	@Before
	public void setup(){
		multiply = new MyCalculator();
	}
	@Test
	public void multiplyTwoPositiveNumbers() {
		
		int multiplication = multiply.multiplyTwoNumbers(10,5);
		assertEquals(50, multiplication);
		
	}
	@Test

	public void multiplyTwoNegativeNumbers() {
		
		int multiplication = multiply.multiplyTwoNumbers(-10,-5);
		assertEquals(50, multiplication);
		
	}
	@Test
	public void multiplyOnePositiveAndOneNegativeNumber() {
		
		int multiplication = multiply.multiplyTwoNumbers(-10,5);
		assertEquals(-50, multiplication);
		
	}

}
