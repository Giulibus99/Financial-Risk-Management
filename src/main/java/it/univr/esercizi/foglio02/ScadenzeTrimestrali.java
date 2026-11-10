package it.univr.esercizi.foglio02;

// Esercizio 16

public class ScadenzeTrimestrali {

	public static void main(String[] args) {
		int mese = 1;
		while (mese <= 12) {
			if (mese % 3 == 0) {
				System.out.println("Mese: " + mese + ", prevista una scadenza trimestrale");
			}
			mese++;
		}
	}

}
