package it.univr.esercizi.foglio01;
/*
 * Esercizio 16
 */

public class NumeroTitoliCasting {

	public static void main(String[] args) {
		int titoliInPortafoglio = 37;
		long titoliLong = titoliInPortafoglio;
		float titoliFloat = titoliLong;
		double titoliDouble = titoliFloat;
		
		System.out.println("Numero intero: " + titoliInPortafoglio);
		System.out.println("Numero long: " + titoliLong);
		System.out.println("Numero float: " + titoliFloat);
		System.out.println("Numero double: " + titoliDouble);

	}

}
