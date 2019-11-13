package com.training.inheritance;

public class CorporateTraining extends Training{

	private int days;
	
	/* 
	 * Default constructor 
	 */
	public CorporateTraining() {
		super();
	
	}
	/* 
	 * parameterized constructor 
	 */ 
	public CorporateTraining(String subject, double fees,int days) {
		super(subject, fees);
		this.days = days;
	}
	/*
	 * mutators and accessor methods
	 */
	public int getDays() {
		return days;
	}
	public void setDays(int days) {
		this.days = days;
	}
	
	/*
	 * calculating charges for corporate training according to days
	 */
	public double getOrderValue() {
		double charges= super.getFees() * days;
		return charges;
		
	}

}
