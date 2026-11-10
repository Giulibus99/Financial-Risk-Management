package it.univr.esercizi.foglio02;

// Esercizio 12

public class VersamentoDoWhile {

	public static void main(String[] args) {
		int capitale = 1200;
		int obiettivo = 1000;
		int versamento = 100;
		int numeroVersamenti = 0;
		
		do {
			capitale += versamento;
			numeroVersamenti++;
			System.out.println("Nuovo capitale: " + capitale);
		} while (capitale < obiettivo);

	}

}
