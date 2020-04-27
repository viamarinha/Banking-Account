package ZnovKarti;

public class Koloda {
	final String[] cardsNames = { "six cnerva", "six buben", "six xrest", "six pic", "seven cnerva", "seven buben",
			"seven xrest", "seven pic", "eight cnerva", "eight buben", "eight xrest", "eight pic", "nine cnerva",
			"nine buben", "nine xrest", "nine pic", "ten cnerva", "ten buben", "ten xrest", "ten pic", "valet cnerva",
			"valet buben", "valet xrest", "valet pic", "dama cnerva", "dama buben", "dama xrest", "dama pic",
			"korol cnerva", "korol buben", "korol xrest", "korol pic", "tuz cnerva", "tuz buben", "tuz xrest",
			"tuz pic", };

	int[] koloda = null;

	public Koloda() {
		koloda = new int[cardsNames.length];
		for(int i = 0; i < cardsNames.length; i ++)
		{
			koloda[i] = i;
		}

	}

	public int[] getKoloda() {
		return this.koloda;
	}
	
	public void pomishatKartiVkolode() {
		
		Generator.pomishatKarti(getKoloda());
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < cardsNames.length; i++ ) {
		sb.append(cardsNames[koloda[i]] + "\n");
		}
		return sb.toString();
		
	}
	
}
