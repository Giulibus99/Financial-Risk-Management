package it.univr.esercizi.foglio03;

/*
 * Esercizio 14 
 */

public class QuotazioniGiornaliere {

	public static void main(String[] args) {
		double[] quotazione = new double[4];
		quotazione[0] = 98.5;
		quotazione[1] = 101.0;
		quotazione[2] = 99.5;
		quotazione[3] = 104.0;
		
		for (int i = 0; i <= 3; i++) {
			int giorno = i+1;
			System.out.println("Al giorno " + giorno + 
					" la quotazione è: " + quotazione[i]);
		}


	}

}
