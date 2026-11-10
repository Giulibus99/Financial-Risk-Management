package it.univr.esercizi.foglio02;

// Esercizio 19

public class ConfrontoForWhile {

	public static void main(String[] args) {
		int capitaleIniziale = 500;
		int versamenti = 100;
		
		int capitaleFor = capitaleIniziale;
		int capitaleWhile = capitaleIniziale;
		
		int numeroVersamenti = 0;
		
		boolean risultatiUguali;
		
		for (int i = 0; i < 5; i++) {
			capitaleFor += versamenti;
		}
		

		while (numeroVersamenti < 5) {
			capitaleWhile += versamenti;
			numeroVersamenti++;
		}
		
		risultatiUguali = (capitaleFor == capitaleWhile);
		System.out.println("Risultati uguali? " + risultatiUguali);
		System.out.println("Capitale (for): " + capitaleFor);
		System.out.println("Capitale (while): " + capitaleWhile);
	}

}
