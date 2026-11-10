package it.univr.esercizi.foglio02;

// Esercizio 10

public class PianoAccumuloWhile {

	public static void main(String[] args) {
		int capitale = 1000;
		int versamentoPeriodico = 250;
		int obiettivo = 2000;
		int numeroVersamenti = 0;
		
		while (capitale < obiettivo) {
			capitale += versamentoPeriodico;
			System.out.println("Nuovo capitale: " + capitale);
			numeroVersamenti++;
		}
		
		System.out.println("Numero versamenti: " + numeroVersamenti);

	}

}
