package com.training.inheritance.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritance.PrintDate;

public class PrintDateTest {
	PrintDate date,date1;
	/*
	 * Initializing object of PrintDate class using default constructor 
	 *
	 */
	@Before
	public void setUp() {
		 date= new PrintDate();	 
	}
	/*
	 * Initializing date attribute of PrintDate class 
	 * using mutator method
	 */
	@Test
	public void testPrintDateOperationWhenDateIsSetByMutator() {
		date.setDate("2019-11-12");
		assertEquals("2019-11-12",date.getDate());
	}
	/*
	 * Initializing date attribute of PrintDate class 
	 * using default constructor
	 */
	@Test
	public void testPrintDateOperationWhenDateIsSetByDefaultConstructor() {
		
		assertEquals("2019-11-12",date.getDate());
	}
	/*
	 * Initializing date attribute of PrintDate class 
	 * using parameterized constructor
	 */
	@Test
	public void testPrintDateOperationWhenDateIsSetByParameterizedConstructor() {
		date1=new PrintDate("2019-11-12");
		assertEquals("2019-11-12",date1.getDate());
	}
}
