package com.training.inheritance;

public abstract class Training {

	private int id;
	private String subject;
	private double fees;
	
	/*default contructor*/
	Training(){
		id=101;
		
	}
	
	/*
	 * parameterized constructor
	 */
	Training(String subject, double fees){
		this();
		this.subject=subject;
		this.fees=fees;
	}
	
	/*
	 * mutators and accessor methods
	 */
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public abstract double getOrderValue();
		
	
}


