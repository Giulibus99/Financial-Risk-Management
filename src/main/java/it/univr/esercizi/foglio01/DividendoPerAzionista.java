package it.univr.esercizi.foglio01;
/*
 * Esercizio 14
 */

public class DividendoPerAzionista {

	public static void main(String[] args) {
		int dividendoTotaleEuro = 7;
		int numeroAzionisti = 2; 
		int dividendoIntero = dividendoTotaleEuro / numeroAzionisti;
		double dividendoPreciso = (double)dividendoTotaleEuro / numeroAzionisti;
		
		System.out.println("Il dividendo intero e' pari a " + dividendoIntero + " euro");
		System.out.println("Il dividendo preciso e' pari a " + dividendoPreciso + " euro");

	}

}
