package com.training.inheritance.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.training.inheritance.CorporateTraining;
import com.training.inheritance.PublicTraining;
import com.training.inheritance.Training;

public class TrainingTest {

	Training publicTtraining,corporateTraining;
	
	/*
	 * creates and initialize the object of CorporateTraining and PublicTraining classes
	 */
	@Before
	public void setUp() {
		publicTtraining = new PublicTraining("Java", 5000, 50);
		corporateTraining= new CorporateTraining("Big Data",35000,4);
	}
	/*
	 * testing training cost for public training
	 */
	@Test
	public void testGetOrderValueForPublicTrainingClassObject() {
		assertEquals(250000,publicTtraining.getOrderValue(),0.01);
	}
	/*
	 * testing training cost for corporate training
	 */
	@Test
	public void testGetOrderValueForCorporateTrainingClassObject() {
		assertEquals(140000,corporateTraining.getOrderValue(),0.01);
	}
	
	
	
	
}
