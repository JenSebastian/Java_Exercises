package com.siriuscom.dates;

public class DateDriver {

	public static void main(String[] args) {
		
		DateExercise dateEx = new DateExercise();
		System.out.println("Current Time in NY is: " + dateEx.getNYTime());
		System.out.println("Months remaining: " + dateEx.remainingMonths());
		System.out.println("First and Last days: ");
		dateEx.getFirstLastDay();
		System.out.println("Ten days: ");
		dateEx.getTenDays();
		System.out.println("Is it an Anagram?: " + dateEx.isAnagram());
		System.out.println("My initials: " + dateEx.getInitials());
		dateEx.dateFormatter();
	}

}
