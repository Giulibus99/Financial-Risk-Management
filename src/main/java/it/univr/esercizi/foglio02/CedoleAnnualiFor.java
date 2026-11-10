package it.univr.esercizi.foglio02;

// Esercizio 13

public class CedoleAnnualiFor {

	public static void main(String[] args) {
		int cedolaAnnuaEuro = 35;
		int cedoleTotaliEuro = 0;
		
		for (int i = 1; i <= 5; i++) {
			cedoleTotaliEuro += cedolaAnnuaEuro;
			System.out.println("Anno: " + i + ". Totale accumulato: " + cedoleTotaliEuro);
		}
		
		System.out.println("Totale accumulato: " + cedoleTotaliEuro);

	}

}
