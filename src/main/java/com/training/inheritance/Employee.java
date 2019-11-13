package com.training.inheritance;

import com.training.inheritance.exception.InvalidInputException;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical=100;
	private double pf;
	private double pt=200;
	private double netSalary;
	private double grossSalary;
	
	/*
	 * default constructor
	 */
	public Employee() {
		super();
		
		
	}
	
	/*
	 * parameterized constructor
	 */
	public Employee(int employeeId, String employeeName, double basicSalary) throws InvalidInputException {
		super();
		validateInputs(employeeName, basicSalary);
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.pf=this.basicSalary*0.12;
		this.hra=this.basicSalary*0.5;
		
		
	}
	
	/*
	 * mutators and accessor methods
	 */
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getPf() {
		return pf;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public double getPt() {
		return pt;
	}

	public void setPt(double pt) {
		this.pt = pt;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double calculateGrossSalary() {
		
		this.grossSalary = this.basicSalary + this.hra + this.medical;
		return this.grossSalary;
		
	}
	public double calculateNetSalary() {
		this.netSalary =this.calculateGrossSalary() -(this.pt+this.pf);
		return this.netSalary;
	}
	/*
	 * returns details of employee
	 */
	public String getEmployeeDetails() {
		return "Employee Id : "+this.employeeId +" Employee Name : "+this.employeeName+
				" Basic Salary : "+this.basicSalary+" Net Salary : "+this.calculateNetSalary()+" Gross Salary : "+this.calculateGrossSalary();




	}
	
	public static String showDetails(Employee employee) {
		return employee.getEmployeeDetails();
		 
		
	}
	/*
	 * validate inputs
	 */
	public void validateInputs(String employeeName, double basicSalary) throws InvalidInputException {
		if(employeeName.equals(" ") || employeeName.equals(null)) {
			throw new InvalidInputException("Please enter valid name");
		}
		else if(basicSalary<=0) {
			throw new InvalidInputException("Basic Salary cannot be zero or negative");
		}
	}

}
