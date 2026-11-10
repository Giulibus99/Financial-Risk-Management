package it.univr.esercizi.foglio03;

/*
 * Esercizio 15
 */

public class MediaQuotazioni {

	public static void main(String[] args) {
		double[] quotazioni = new double[5];
		quotazioni[0] = 100.0;
		quotazioni[1] = 102.0;
		quotazioni[2] = 99.0;
		quotazioni[3] = 103.0;
		quotazioni[4] = 101.0;
		double somma = 0;
		

		for (int i = 0; i < quotazioni.length; i++) {
			somma += quotazioni[i];
		}
		double media = somma / quotazioni.length;
		System.out.println("La somma è: " + somma);
		System.out.println("La media è: " + media);
		
		
	}

}
