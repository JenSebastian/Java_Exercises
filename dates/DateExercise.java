package com.siriuscom.dates;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DateExercise {								//Get current time in NY

	public String getNYTime() {
		
		Calendar calendar = Calendar.getInstance();

		DateFormat df = new SimpleDateFormat("hh:mm aaa");
		df.setTimeZone(TimeZone.getTimeZone("America/New_York"));
		String NYTime = df.format(calendar.getTime());	
		return NYTime;
		
		
	}
	
	public int remainingMonths() {						//Get remaining months in this year
		
		
		Calendar calendar = Calendar.getInstance();

	    int monthsRemaining = 12 - (calendar.get(Calendar.MONTH) + 1);
	    return monthsRemaining;
		
		
	}
	
	public void getFirstLastDay() {						//Get first and last Day of each week 
	
		
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
		
		DateFormat df = new SimpleDateFormat("EEE dd");
		for(int i=0; i<4; i++)
		{
		    System.out.print("Start Date : " + df.format(calendar.getTime()) + ", ");
		    calendar.add(Calendar.DAY_OF_WEEK, 6);
		    System.out.println("End Date : " + df.format(calendar.getTime()));
		    calendar.add(Calendar.DAY_OF_WEEK, 1);
		}
	}
	
	public void getTenDays() {							//get the prev 10 days and next 10 days
		
		Calendar calendar = Calendar.getInstance();
		Calendar calendar2 = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat("EEE dd");

		for (int i = 0; i < 10; i++) {
			calendar2.add(Calendar.DATE, -1);
			String daysBefore = df.format(calendar2.getTime());
			System.out.println(daysBefore);
		}
		
		for (int i = 0; i < 10; i++) {
			calendar.add(Calendar.DATE, 1);
			String dayslater = df.format(calendar.getTime());
			System.out.println(dayslater);
		}
		
	
	}
	
	public boolean isAnagram() {						//check if these are anagrams of each other
		
		String firstWord = "parliament";
		String secondWord = "partial men";
		
		char[] firstWordChar = firstWord.replaceAll("[\\s]", "").toLowerCase().toCharArray();
		char[] secondWordChar = secondWord.replaceAll("[\\s]", "").toLowerCase().toCharArray();
		
		Arrays.sort(firstWordChar);
		Arrays.sort(secondWordChar);
		
		if (Arrays.equals(firstWordChar, secondWordChar)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void changeDateToCalendar() {				//change Date to calendar
		Date date = new Date();
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		
	}
	
	public void changeCalendarToDate() {				//change calendar to date
		Calendar calendar = Calendar.getInstance();
		calendar.getTime();
	}
	
	public String getInitials() {					//get initials from name
		
		String initials = "";
		String name = "Jenifer Sebastian";
		String[] nameArray = name.split("\\s");
		
		for (int i = 0; i < nameArray.length; i++) {
			initials += nameArray[i].charAt(0);
		}
		return initials;
	}
	
	public void dateFormatter() {
		
		Calendar calendar = Calendar.getInstance();
		
		DateFormat df = new SimpleDateFormat("yyy-mm-dd");              //2016-09-16  
		String dateOne = df.format(calendar.getTime());	
		System.out.println(dateOne);
		
		DateFormat df2 = new SimpleDateFormat("dd::MMM::yyyy");			//16::Sep::2016   
		String dateTwo = df2.format(calendar.getTime());	
		System.out.println(dateTwo);
		
		DateFormat df3 = new SimpleDateFormat("yyyy-mm-dd-hh:mm:ss.S");  //2016-09-16T11:46:01.455    
		String dateThree = df3.format(calendar.getTime());	
		System.out.println(dateThree);
		
		DateFormat df4 = new SimpleDateFormat("dd:MMM::yyyy hh::mm::ss");  //16::Sep::2016 11::46::01                                                                                          
		String dateFour = df4.format(calendar.getTime());	
		System.out.println(dateFour);
	
	}

	
	
}

