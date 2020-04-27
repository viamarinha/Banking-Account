package ZnovKarti;

public class Main {
	
	
	

	public static void main(String[] args) {
		
		Koloda koloda = new Koloda();
		
		System.out.println(koloda.toString());
		
		koloda.pomishatKartiVkolode();
		System.out.println("****************");
		
		System.out.println(koloda.toString());

	}

}
