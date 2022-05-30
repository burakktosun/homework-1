package com.bilgeadamboost.marathon;

import java.time.LocalDate;

public class Teacher extends Employees{

	
	public Teacher(String name, String surname, LocalDate birthDay, LocalDate startDate, LocalDate endDate,
			String telNo, String ssnTitle, int ssnNum, boolean isMarried, double startingSalary, double currSalary, String gender) {
		super(name, surname, birthDay, startDate, endDate, telNo, ssnTitle, ssnNum, isMarried, startingSalary, currSalary, gender);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public String toString() {
		
		return "Teacher ["+getSsnTitle() +"-"+getSsnNum() + " " + "[" + getName() + " " + getSurname() +"]"+ " " + getGender() + " "+  getBirthDay() + " " +getStartDate()+ " "+getEndDate()+ " " + getStartingSalary() + " " + getCurrSalary() + "]";

	}
	
	
	
	
	
	
	
	
	
}
