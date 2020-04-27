package Karti;

public class Main {

	public Main() {
	}

	public static void main(String[] args) {

		CardsPack cp = new CardsPack();
		
		System.out.println("\n" + cp.toString());

		//Reshuffler.reshuffle(cp.getPackOfCards());
		System.out.println(" After Reshuffler");
		cp.melangeur();
		
		System.out.println(cp.toString());
	}

}