package com.training.inheritance;

import com.training.inheritance.exception.InvalidInputException;

public class MarketingExecutive extends Employee{

	private double kilometersTravelled;
	private double tourAllowance ;
	private double telephoneAllowance = 15000;
	/*default contructor*/
	public MarketingExecutive() {
		super();
		
	}
	
	/*
	 * parameterized constructor
	 */
	
	public MarketingExecutive(int employeeId, String employeeName, double basicSalary,double kilometersTravelled) throws InvalidInputException {
		super(employeeId, employeeName, basicSalary);
		this.tourAllowance = kilometersTravelled * 5;
		
	}
	
	/*
	 * mutators and accessor methods
	 */
	
	public double getKilometersTravelled() {
		return kilometersTravelled;
	}

	public void setKilometersTravelled(double kilometersTravelled) {
		this.kilometersTravelled = kilometersTravelled;
	}

	public double getTourAllowance() {
		return tourAllowance;
	}

	public void setTourAllowance(double tourAllowance) {
		this.tourAllowance = tourAllowance;
	}

	public double getTelephoneAllowance() {
		return telephoneAllowance;
	}

	public void setTelephoneAllowance(double telephoneAllowance) {
		this.telephoneAllowance = telephoneAllowance;
	}
	/*
	 * calculating employee's gross salary
	 */
	@Override
	public double calculateGrossSalary() {
		double salary= super.calculateGrossSalary() + tourAllowance + telephoneAllowance;
		return salary;
		
	}
	
	/*
	 * calculating employee's net salary
	 */
	@Override
	public double calculateNetSalary() {
		double salary= calculateGrossSalary()-(super.getPf()+super.getPt());
		return salary;
	}
	
	/*
	 * returns details of employee
	 */
	@Override
	public String getEmployeeDetails() {
		return super.getEmployeeDetails()+ " kilometersTravelled=" + kilometersTravelled + ", tourAllowance=" + tourAllowance
				+ ", telephoneAllowance=" + telephoneAllowance ;
	}
	
	
	@Override
	public String toString() {
		return "Employee Id : "+super.getEmployeeId() +" Employee Name : "+super.getEmployeeName()+" kilometersTravelled=" + kilometersTravelled + ", tourAllowance=" + tourAllowance
				+ ", telephoneAllowance=" + telephoneAllowance ;
	}

	
	
	
	
}
