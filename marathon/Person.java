package com.bilgeadamboost.marathon;

import java.time.LocalDate;


public class Person {
	private String name;
	private String surname;
	private LocalDate birthDay;
	private LocalDate startDate;
	private LocalDate endDate;
	private String telNo;
	private String gender;
	
	public Person() {

	}
	
	public Person(String name, String surname, LocalDate birthDay, LocalDate startDate, LocalDate endDate,
			String telNo, String gender) {
		super();
		this.name = name;
		this.surname = surname;
		this.birthDay = birthDay;
		this.startDate = startDate;
		this.endDate = endDate;
		this.telNo = telNo;
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", surname=" + surname + ", birthDay=" + birthDay + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", telNo=" + telNo + ", gender=" + gender + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public String getSurname() {
		return surname;
	}


	public void setSurname(String surname) {
		this.surname = surname;
	}


	public LocalDate getBirthDay() {
		return birthDay;
	}


	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}


	public LocalDate getStartDate() {
		return startDate;
	}


	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}


	public LocalDate getEndDate() {
		return endDate;
	}


	public void setEndDate(LocalDate endDate) {
		this.endDate = endDate;
	}


	public String getTelNo() {
		return telNo;
	}


	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	



	
}