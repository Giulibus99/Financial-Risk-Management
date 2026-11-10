package it.univr.esercizi.foglio03;

/*
 * Esercizio 12
 */

public class ConfrontoRiferimenti {
	
	private int numeroQuote;
	
	private void imposta(int numeroQuote) {
		this.numeroQuote = numeroQuote;
	}
	private int leggiNumeroQuote() {
		return this.numeroQuote;
	}

	public static void main(String[] args) {
		ConfrontoRiferimenti oggetto1 = new ConfrontoRiferimenti();
		ConfrontoRiferimenti oggetto2 = new ConfrontoRiferimenti();
		oggetto1.imposta(20);
		oggetto2.imposta(20);
		ConfrontoRiferimenti oggetto3 = oggetto1;
		
		System.out.println("1-2: " + (oggetto1 == oggetto2));
		System.out.println("1-2 diverso: " + (oggetto1 != oggetto2));
		System.out.println("1-3: " + (oggetto1 == oggetto3));
		
		System.out.println("1-2: " + (oggetto1.leggiNumeroQuote() == oggetto2.leggiNumeroQuote()));
		System.out.println("1-3: " + (oggetto1.leggiNumeroQuote() == oggetto3.leggiNumeroQuote()));

	}

}
