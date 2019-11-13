package com.training.inheritance.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.inheritance.Employee;
import com.training.inheritance.Manager;
import com.training.inheritance.MarketingExecutive;
import com.training.inheritance.exception.InvalidInputException;

public class EmployeeTest1 {

	/*
	 * checks output when employee is manager
	 */
	@Test
	public void testShowDetailsWithManagerClassObject() throws InvalidInputException {
		Manager manager = new Manager(101,"Chakravati",250000);
		assertEquals("Employee Id : 101 Employee Name : Chakravati Basic Salary : 250000.0 Net Salary : 404900.0 Gross Salary : 435100.0 petrolAllowance=20000.0, foodAllowance=32500.0, otherAllowance=7500.0" 
	,Employee.showDetails(manager));
		
	}
	/*
	 * checks output when employee is marketingExecutive
	 */
	@Test
	public void testShowDetailsWithMarketingExecutiveClassObject() throws InvalidInputException {
		MarketingExecutive marketingExecutive= new MarketingExecutive(102,"XYZ",50000,5);
		System.out.println(Employee.showDetails(marketingExecutive));
		assertEquals("Employee Id : 102 Employee Name : XYZ Basic Salary : 50000.0 Net Salary : 83925.0 Gross Salary : 90125.0 kilometersTravelled=0.0, tourAllowance=25.0, telephoneAllowance=15000.0"
	,Employee.showDetails(marketingExecutive));
		
		
	}
	/*
	 * checks output  when manager has negative basic salary
	 */
	@Test(expected= InvalidInputException.class)
	public void testGetEmployeeDetailsWithNegativeBasicSalary() throws InvalidInputException {
		Manager manager = new Manager(101,"Chakravati",-250000);
		Employee.showDetails(manager);
	}
	/*
	 * checks output when marketingExecutive's name is blank
	 */
	@Test(expected= InvalidInputException.class)
	public void testGetEmployeeDetailsWithEmptyName() throws InvalidInputException {
		MarketingExecutive marketingExecutive= new MarketingExecutive(102," ",50000,5);
		Employee.showDetails(marketingExecutive);
	}

}
