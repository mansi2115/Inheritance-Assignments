package com.training.inheritance;

import java.time.LocalDate;

public class PrintDate {
	
	private String date;
	
	
	/*
	 * Default constructor for initializing date attribute 
	 */
	public PrintDate() {
		super();
		date =LocalDate.now().toString();
	}
	/*
	 * Parameterized constructor for initializing date attribute 
	 */
	public PrintDate(String date) {
		super();
		this.date = date;
	}
	/*
	 * Mutators and accessor methods
	 */
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	

}
