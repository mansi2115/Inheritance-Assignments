package com.training.inheritance.tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.training.inheritance.Employee;
import com.training.inheritance.exception.InvalidInputException;

public class EmployeeTest {

	Employee employee;
	
	/*
	 * checks output for valid employee details
	 */
	@Test
	public void testGetEmployeeDetailsWithValidInputs() throws InvalidInputException {
		employee=new Employee(101, "ABC", 20000);
		assertEquals("Employee Id : 101 Employee Name : ABC Basic Salary : 20000.0 Net Salary : 27500.0 Gross Salary : 30100.0",employee.getEmployeeDetails());
	}
	/*
	 * checks output when employee has negative basic salary
	 */
	@Test(expected= InvalidInputException.class)
	public void testGetEmployeeDetailsWithNegativeBasicSalary() throws InvalidInputException {
		employee=new Employee(101, "ABC", -20000);
		employee.getEmployeeDetails();
	}
	/*
	 * checks output when employee's name is blank
	 */
	@Test(expected= InvalidInputException.class)
	public void testGetEmployeeDetailsWithEmptyName() throws InvalidInputException {
		employee=new Employee(101, " ", 20000);
		employee.getEmployeeDetails();
	}
}
