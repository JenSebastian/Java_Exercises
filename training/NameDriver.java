package com.siriuscom.training;

public class NameDriver {

	public static void main(String[] args) {

		String sentence = "\"Rahul U Rravid\" is the wall of India.";
		String sentence2 = "\"Rahul U Rravid\" is the wall of India.";

		NameExercise nameGame = new NameExercise();
		String name = nameGame.getName(sentence);
		String name2 = nameGame.getName(sentence2);
		
		String initials = nameGame.getInitials(name);
		String initials2 = nameGame.getInitials(name2);

		
		String type = nameGame.getTypeOfPerson(initials);
		String type2 = nameGame.getTypeOfPerson(initials2);
		
		String typeOfPeople = nameGame.compareTwoNames(initials, initials2, type, type2);

//		System.out.println(type);
//		System.out.println(type2);

		System.out.println(initials + "." + name + " is " + type + " and " + initials2 + "." + name2 + " is " + type2  + ". They are " + typeOfPeople);

	}

}
