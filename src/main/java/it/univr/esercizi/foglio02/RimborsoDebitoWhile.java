package it.univr.esercizi.foglio02;

// Esercizio 11

public class RimborsoDebitoWhile {

	public static void main(String[] args) {
		int debitoResiduo = 1000;
		int rata = 200;
		int numeroRate = 0;
		
		while (debitoResiduo > 0) {
			debitoResiduo -= rata;
			numeroRate++;
			System.out.println("Debito residuo: " + debitoResiduo);
		}
		System.out.println("Numero rate: " + numeroRate);

	}

}
