package it.univr.esercizi.foglio03;

/*
 * Esercizio 17
 */

public class MassimoPrezzo {

	public static void main(String[] args) {
		double[] prezzi = {101, 104, 102, 99, 107};
		int lunghezzaArray = prezzi.length;
		double massimo = prezzi[0];
		
		int i = 0;
		int giornoMassimo = 1;
		while (lunghezzaArray > 0) {
			if(prezzi[i] > massimo) {
				massimo = prezzi[i];
				giornoMassimo = i+1;
			}
			i++;
			lunghezzaArray--;
		}
		
		System.out.println("Il massimo è: " + massimo + 
				" registrato il giorno " + giornoMassimo);

	}

}
