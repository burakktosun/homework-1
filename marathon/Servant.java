package com.bilgeadamboost.marathon;

	import java.time.LocalDate;

	public class Servant extends Employees {
		public Servant(String name, String surname, LocalDate birthDay, LocalDate startDate, LocalDate endDate,
				String telNo, String ssnTitle, int ssnNum, boolean isMarried, double startingSalary, double currSalary, String gender) {
			super(name, surname, birthDay, startDate, endDate, telNo, ssnTitle, ssnNum, isMarried, startingSalary, currSalary, gender);
			
		}

		@Override
		public String toString() {
			
			return "Servant ["+getSsnTitle() +"-"+getSsnNum() + " " + "[" + getName() + " " + getSurname() +"]"+ " " + getGender() + " " + getBirthDay() + " " +getStartDate()+ " "+getEndDate()+ " " + getStartingSalary() + " " + getCurrSalary() + "]";

		}
		
	}

