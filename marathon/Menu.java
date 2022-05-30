package com.bilgeadamboost.marathon;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {
	public static Scanner scan =  new Scanner(System.in);
	
	public static void main(String[] args) {
		BAUtils.header("SCHOOL MANAGEMENT SYSTEM MENU");
		menu();
		BAUtils.footer();
	}	
	
	// Database
	public static List<Employees> defaultEmployees () {
		LocalDate birthDay = LocalDate.of(1995, 03, 29);
		List<Employees> list = new ArrayList<Employees>();
		
		Teacher teacher1 = new Teacher("Arda Kaan", "Aktas", LocalDate.of(1998, 03, 24), LocalDate.of(2001, 05, 10), null, "123456", "T", 1, false, 1000.0, 2000.0, "Male");
		Teacher teacher2 = new Teacher("Sevilay", "Yildirim", LocalDate.of(1998, 04, 27), LocalDate.of(2012, 10, 29), null, "1234356", "T", 2, true, 1500.0, 2100.0, "Female");
		Teacher teacher3 = new Teacher("Elif", "Yildirim", LocalDate.of(2000, 07, 19), LocalDate.of(2010, 05, 29), LocalDate.of(2020, 03, 22), "5456825602", "T", 3, false, 1350.0, 2200.0,"Female");
		Officer officer1 = new Officer("Dilayda", "Hatiper", LocalDate.of(1990, 10, 25), LocalDate.of(2001, 04, 04),null, "12345678", "O", 4, true, 1000.0, 1050.0,"Female");
		Officer officer2 = new Officer("Can", "Gundogdu", LocalDate.of(1995, 05, 16), LocalDate.of(2018, 05, 19), null, null, "O", 5, true, 950.0, 1200.0,"Male");
		Officer officer3 = new Officer("Erdi", "Taskin", LocalDate.of(1989, 11, 26), LocalDate.of(2020, 12, 22), LocalDate.of(2020, 12, 02), "12344114", "O", 6, false, 950.0, 0,"Male");
		Servant servant1 = new Servant("Esmanur", "Kavak", LocalDate.of(1994, 06, 19), LocalDate.of(2012, 12, 12), LocalDate.of(2020, 01, 29), "123123123", "J", 7, true, 750.0, 0,"Female");
		Servant servant2 = new Servant("Bugra", "Calimli", LocalDate.of(1972, 03, 31), LocalDate.of(2002, 10, 22), null, "123123123", "J", 8, false, 800.0, 950.0,"Male");
		list.add(teacher1);
		list.add(teacher2);
		list.add(teacher3);
		list.add(officer1);
		list.add(officer2);
		list.add(officer3);
		list.add(servant1);
		list.add(servant2);
		
		return list;
	}


	public static void menu() {
		
		boolean isContinue;
		do {
			System.out.println("(1) Add new employee\n(2) Employee List\n(3) Former Employees\n(4) Create New Course\n(5) Appoint Student\n(6) Class List\n(7) Current Courses\n(8) Gift List\n(9) Wage List\n(0) Exit");
			int userChoice = scan.nextInt();
			scan.nextLine();
			switch (userChoice) {
				case 1:
					defaultEmployees();
					int count = 1;
					for (Employees employees : defaultEmployees()) {
						System.out.println(count +". Person is added to the list.");
						count++;
					}
					break;
				case 2:
					showEmployees(defaultEmployees());
					break;
				case 3:
					formerEmployees(defaultEmployees());
					break;
				case 8:
					giveGift2Person(defaultEmployees());
					break;
				case 9:
					personWageList(defaultEmployees());
					break;
				case 0:
				System.exit(0);
				
				default:
					System.out.println("Coming soon...");
					
					
			}
			System.out.println("Do you want to continue (y,n)");
			String want2Continue = scan.nextLine();
			if(want2Continue.equalsIgnoreCase("y")) {
				isContinue = true;
			}
			else if (want2Continue.equalsIgnoreCase("n")) {
				isContinue = false;
			}
			else {
				System.out.println("Please enter y or n");
				isContinue = true;
			}
		} while (isContinue == true);
		
		
	}
	
	public static void showMenu() {
		BAUtils.header("SCHOOL MANAGEMENT SYSTEM MENU");
		System.out.println();
		System.out.println("(1) Add new employee\n"
				+ "(2) Employee List\n"
				+ "(3) Former Employees\n"
				+ "(4) Create New Course\n"
				+ "(5) Appoint Student\n"
				+ "(6) Class List\n"
				+ "(7) Current Courses\n"
				+ "(8) Gift List\n"
				+ "(9) Wage List\n(0) Exit");
		scan.nextInt();
		
	}
	
	
	
	public static void showEmployees (List<Employees> list) {
		for (Employees temp : list) {
			if (temp.getEndDate() == null)
			System.out.println(temp);
		}
	}
	
	
	public static void formerEmployees(List<Employees> employees) {
		List<Employees> formerEmployees = new ArrayList<Employees>();
		for (Employees temp : employees) {
			if(temp.getEndDate() != null) {
				formerEmployees.add(temp);
			}

		}
			for (Employees temp : formerEmployees) {
				System.out.println(temp.getName() + " " + temp.getSurname() + " Start in " + temp.getStartDate() + " Ends in " + temp.getEndDate() + " Total work time: " 
			+ Period.between(temp.getStartDate(),temp.getEndDate()).getYears() + " years " + Period.between(temp.getStartDate(), temp.getEndDate()).getMonths() + " months" );
			
		}
	}
	
	
	private static void giveGift2Person(List<Employees> employees) {
		LocalDate local = LocalDate.now();
		List<Employees> birthDay = new ArrayList<Employees>();
		List<Employees> comingGifts = new ArrayList<Employees>();
		for (Employees temp : employees) {
		    if (temp.getBirthDay().getMonth() == local.getMonth() && temp.getBirthDay().getDayOfMonth() == local.getDayOfMonth() && temp.getGender() == "Female") {
			birthDay.add(temp);
		    }
		    if (temp.getStartDate().getMonth() == local.getMonth() || (temp.getBirthDay().getMonth() == local.getMonth()&& temp.getGender() == "Female")){
			
			comingGifts.add(temp);
		    }
		}
		for (Object object : birthDay) {
		    System.out.println(object);
		}
		System.out.println("The employees that started work or have birthday in this month are:");
		for (Object object : comingGifts) {
			System.out.println(object);
		}
	    }
	
	
	private static void personWageList(List<Employees> employee) {
		List<Employees> wage = new ArrayList<Employees>();
		for (Employees temp : employee) {
		    if (temp.getCurrSalary() != 0) {
			wage.add(temp);
		    } else {
			continue;
		    }
		}
		for (Object object : wage) {
		    System.out.println(object);
		}
	}
}
