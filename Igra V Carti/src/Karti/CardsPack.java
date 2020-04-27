package Karti;

import java.util.Arrays;

public class CardsPack {

	final String[] cardsNames = { "six cnerva", "six buben", "six xrest", "six pic", "seven cnerva", "seven buben",
			"seven xrest", "seven pic", "eight cnerva", "eight buben", "eight xrest", "eight pic", "nine cnerva",
			"nine buben", "nine xrest", "nine pic", "ten cnerva", "ten buben", "ten xrest", "ten pic", "valet cnerva",
			"valet buben", "valet xrest", "valet pic", "dama cnerva", "dama buben", "dama xrest", "dama pic",
			"korol cnerva", "korol buben", "korol xrest", "korol pic", "tuz cnerva", "tuz buben", "tuz xrest",
			"tuz pic", };

	int[] packOfCards = null;

	public CardsPack() {

		packOfCards = new int[36];

		for (int i = 0; i < 36; i++) {
			packOfCards[i] = i;
		}
	}

	public int[] getPackOfCards() {
		return packOfCards;
	}

	public void melangeur() {
		Reshuffler.reshuffle(getPackOfCards());
		System.out.println(Arrays.toString(packOfCards));
	}

	public String toString() {
		StringBuffer cards = new StringBuffer(300);
		for (int i = 0; i < packOfCards.length; i++) {
			cards.append(cardsNames[packOfCards[i]] + "\n");
		}
		return cards.toString();
	}
}
