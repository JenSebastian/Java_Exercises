package com.siriuscom.cards;

public class CardsDriver {

	public static void main(String[] args) {
		
		Card card1 = new Card(Rank.ACE, Suit.CLUBS);
		System.out.println(card1.printCard());
		
	}

}
