package com.siriuscom.training;

public class NameExercise {

	
	public String getName(String sentence) {
		
		int beginningQuoteIndex = sentence.indexOf("\"");
		int endingQuoteIndex = sentence.indexOf("\"", beginningQuoteIndex + 1); 
		String name = sentence.substring(beginningQuoteIndex + 1, endingQuoteIndex);     
		
		return name;	
	}
	
	public String getInitials(String name) {
		
		String initials = "";
		String[] nameArray = name.split("\\s");
		
		for (int i = 0; i < nameArray.length; i++) {
			initials += nameArray[i].charAt(0);
		}
		return initials;
		
	}
	
	private boolean isPalindrome(String s) {
		  int n = s.length();
		  for (int i = 0; i < (n/2); ++i) {
		     if (s.charAt(i) != s.charAt(n - i - 1)) {
		         return false;
		     }
		  }

		  return true;
		}
	
	public String getTypeOfPerson(String initials) {
		
		String type = ""; 
		String lowerInitials = initials.toLowerCase();
		char firstLetter = lowerInitials.charAt(0);
		boolean isMonotoned = true;
		
		for (int i = 1; i < lowerInitials.length(); i++) {
			if (firstLetter != lowerInitials.charAt(i)) {
				isMonotoned = false;
			}
		}
		
		if (isMonotoned) {
			type = "Monotonous";
		} else if (isPalindrome(lowerInitials)) {
			type = "Palonomic";
		} else {
			type = "No-One";
		}
				
		return type;
		
	}
	
	public String compareTwoNames(String initial, String initial2, String type, String type2) {
		
		String typeOfTwo = "";
		if (!"No-One".equals(type)) {
			if (initial.equals(initial2)) {
				if (type.equals(type2)) {
					typeOfTwo = type + "-Twins";
				} else {
					typeOfTwo = "Twins";
				}	
			}
		}
		 
		return typeOfTwo;
		
	}
	

	
}
