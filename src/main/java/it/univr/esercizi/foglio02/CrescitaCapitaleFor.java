package it.univr.esercizi.foglio02;

// Esercizio 14

public class CrescitaCapitaleFor {

	public static void main(String[] args) {
		double capitale = 1000.0;
		double tassoPeriodo = 0.02;
		double incremento;
		
		for (int i = 0; i < 4; i++) {
			incremento = capitale * tassoPeriodo;
			capitale +=incremento;
			System.out.println("Capitale: " + capitale);
		}

	}

}
