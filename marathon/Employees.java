package com.bilgeadamboost.marathon;

import java.time.LocalDate;

public class Employees extends Person{
	private String ssnTitle; 
	private int ssnNum;		
	private boolean isMarried;
	private double startingSalary;
	private double currSalary;
	

	public Employees(String name, String surname, LocalDate birthDay, LocalDate startDate, LocalDate endDate,
			String telNo,String ssnTitle, int ssnNum, boolean isMarried, double startingSalary, double currSalary, String gender) {
		super(name, surname, birthDay, startDate, endDate, telNo,gender);
		this.ssnTitle = ssnTitle;
		this.ssnNum = ssnNum;
		this.isMarried = isMarried;
		this.startingSalary = startingSalary;
		this.currSalary = currSalary;
	}



	@Override
	public String toString() {
		return "Employees ["+ssnTitle +"-"+ssnNum + " " + "[" + getName() + " " + getSurname() +"]"+ " " + getBirthDay() + " " +getStartDate()+ " " + getStartingSalary() + " " + getCurrSalary() + "]";
	}

	public String getSsnTitle() {
		return ssnTitle;
	}



	public void setSsnTitle(String ssnTitle) {
		this.ssnTitle = ssnTitle;
	}



	public int getSsnNum() {
		return ssnNum;
	}



	public boolean isMarried() {
		return isMarried;
	}



	public void setMarried(boolean isMarried) {
		this.isMarried = isMarried;
	}



	public double getStartingSalary() {
		return startingSalary;
	}



	public void setStartingSalary(double startingSalary) {
		this.startingSalary = startingSalary;
	}

	public double getCurrSalary() {
		return currSalary;
	}

	public void setCurrSalary(double currSalary) {
		this.currSalary = currSalary;
	}
	
	
	
	
}
