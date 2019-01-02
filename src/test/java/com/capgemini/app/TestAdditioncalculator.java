package com.capgemini.app;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.app.myCalculator.MyCalculator;

public class TestAdditioncalculator {
	private MyCalculator addition;
	@Before
		public void setUp(){
			addition = new MyCalculator();
		}

		@Test
		public void addTwoPositiveNumbersTest(){
			
			int answer = addition.addTwoNumbers(50,50);
			assertEquals(100, answer);;
			//assertThat(answer,allOf(is(100),instanceOf(Integer.class)));
		}
		@Test
		public void addTwoNegativeNumbersTest() {
			
			
			int answer = addition.addTwoNumbers(-50,-50);
			assertEquals(-100, answer);;
		}
		@Test
		public void addOneNegativeNumberTest(){
			
			
			int answer = addition.addTwoNumbers(50,-50);
			assertEquals(0, answer);;
		}
		@Test
		public void addTwoZerosTest(){
			
			
			int answer = addition.addTwoNumbers(0,0);
			assertEquals(0, answer);;
		}
		@Test
		public void addOneZeroTest()  {
			
			
			int answer = addition.addTwoNumbers(0,50);
			assertEquals(50, answer);
		}
}
