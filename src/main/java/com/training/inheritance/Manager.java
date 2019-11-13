package com.training.inheritance;

import com.training.inheritance.exception.InvalidInputException;

public class Manager extends Employee{
	
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	/*default contructor*/
	public Manager() {
		super();
		
	}
	/*
	 * parameterized constructor
	 */
	public Manager(int employeeId, String employeeName, double basicSalary) throws InvalidInputException {
		super(employeeId, employeeName, basicSalary);
		
		this.petrolAllowance= basicSalary * 0.08;
		this.foodAllowance= basicSalary * 0.13;
		this.otherAllowance=basicSalary * 0.03;
	}
	
	/*
	 * mutators and accessor methods
	 */
	
	public double getPetrolAllowance() {
		return petrolAllowance;
	}
	public void setPetrolAllowance(double petrolAllowance) {
		this.petrolAllowance = petrolAllowance;
	}
	public double getFoodAllowance() {
		return foodAllowance;
	}
	public void setFoodAllowance(double foodAllowance) {
		this.foodAllowance = foodAllowance;
	}
	public double getOtherAllowance() {
		return otherAllowance;
	}
	public void setOtherAllowance(double otherAllowance) {
		this.otherAllowance = otherAllowance;
	}
	@Override
	public double calculateGrossSalary() {
		double salary= super.calculateGrossSalary() + this.foodAllowance+this.otherAllowance+this.petrolAllowance;
		return salary;
		
	}
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
		return super.getEmployeeDetails()+ " petrolAllowance=" + petrolAllowance + ", foodAllowance=" + foodAllowance + ", otherAllowance="
				+ otherAllowance ;
	}
	
	@Override
	public String toString() {
		return "Employee Id : "+super.getEmployeeId() +" Employee Name : "+super.getEmployeeName()+" petrolAllowance=" + petrolAllowance + ", foodAllowance=" + foodAllowance + ", otherAllowance="
				+ otherAllowance ;
	}
	
	
	

}
