package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.app.myCalculator.MyCalculator;

public class TestSubstractionCalculator {
	private MyCalculator substract;

	
	@Before
	public void setup(){
		substract = new MyCalculator();
	}
	@Test
	public void substractTwoPositiveNumbers() {
		int difference = substract.substractTwoNumbers(50,24);
		assertEquals(26, difference);
	}
	@Test
	public void substractOneNegativeNumber() {
		int difference = substract.substractTwoNumbers(50,-25);
		assertEquals(75, difference);
	}
	@Test
	public void substractTwoNegativeNumbers() {
		int difference = substract.substractTwoNumbers(-50,-25);
		assertEquals(-25, difference);
	}
	@Test
	public void substractOneNegativeNumberFromZero() {
		int difference = substract.substractTwoNumbers(0,50);
		assertEquals(-50, difference);

	}
}
