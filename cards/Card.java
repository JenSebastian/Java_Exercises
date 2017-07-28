package com.siriuscom.cards;

public class Card {

	private Rank rank;
	private Suit suit;
	
	
	public Card(Rank rank, Suit suit) {
		this.rank = rank;
		this.suit = suit;
	}
	
	public String printCard() {
		
		return rank + " of " + suit;		
	}
}

