package com.training.inheritance;

public class PublicTraining extends Training{
    int participants;
	
    /*
     * default contructor
     */
	public PublicTraining() {
		super();
		
	}
	/*
	 * parameterized constructor
	 */
	public PublicTraining(String subject, double fees,int participants) {
		super(subject, fees);
		this.participants = participants;
	}

	/*
	 * mutators and accessor methods
	 */
	
	public int getParticipants() {
		return participants;
	}
	public void setParticipants(int participants) {
		this.participants = participants;
	}
	/*
	 * calculating charges for public training according to days
	 */
	public double getOrderValue() {
		double charges= super.getFees() * participants;
		return charges;
		
	}
	

	
	
	

}
