package com.bilgeadamboost.marathon;


import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BAUtils {
	private static Scanner scan = new Scanner(System.in);
	
	public static void footer() {
		System.out.println("\n\n\tThanks for using the program.");
		System.out.println("\t\t See You...");
		closeResources();
	}
	
	public static void header(String title) {
		
		int len = title.length();
		StringBuilder row = new StringBuilder("");
		
		for (int i = 0; i < (len + 6); i++) {
			row.append("=");
		}
		
		System.err.println("\n\n\t\t" + row);
		System.err.println("\t\t** " + title.toUpperCase() + " **");
		System.err.println("\t\t" + row + "\n");
	}
	
	public static String readString(String query) {
		showQuery(query);
		String retVal = scan.nextLine();
		return retVal;
	}
	
	private static void showQuery(String query) {
		System.out.print("\t" + query + ": ");
	}
	
	public static int readInt(String query) {
		int retVal = Integer.MIN_VALUE;
		showQuery(query);
		retVal = scan.nextInt();
		scan.nextLine();
		return retVal;
	}
	
	public static int[] readInt(String start, String query, int numElements) {
		showQuery(start + " " + numElements + " " + query + "\n");
		int[] retVal = new int[numElements];
		for (int i = 0; i < numElements; i++) {
			System.out.print((i + 1) + ". Value : ");
			retVal[i] = scan.nextInt();
		}
		scan.nextLine();
		return retVal;
	}
	
	public static double readDouble(String query) {
		double retVal = Double.NEGATIVE_INFINITY;
		showQuery(query);
		retVal = scan.nextDouble();
		scan.nextLine();
		return retVal;
	}
	
	public static void closeResources() {
		scan.close();
	}
	
	public static boolean wantToEnd(String question, String negativeAnswer) {
		boolean retVal = true;
		
		showQuery(question);
		String answer = scan.next();
		
		retVal = answer.equalsIgnoreCase(negativeAnswer);
		scan.nextLine();
		return !retVal;
	}
	
	
	public static String dateAsString(long timestamp) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
		return dateTime.format(DateTimeFormatter.ofPattern("dd.MMM.yyyy"));
	}
	
	
	public static String timeAsString(long timestamp) {
		LocalDateTime dateTime = LocalDateTime.ofEpochSecond(timestamp, 0, ZoneOffset.UTC);
		return dateTime.format(DateTimeFormatter.ofPattern("HH:mm"));
	}
	
	
	
	
	
	
	
	
	

}