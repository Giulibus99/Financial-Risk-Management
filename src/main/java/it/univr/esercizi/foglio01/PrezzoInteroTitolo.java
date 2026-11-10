package it.univr.esercizi.foglio01;
/*
 * Esercizio 15 
 */
public class PrezzoInteroTitolo {

	public static void main(String[] args) {
		double prezzoTitolo = 98.75;
		int prezzoIntero = (int)prezzoTitolo;
		double prezzoRicostruito = prezzoIntero;
		
		System.out.println("Prezzo iniziale: " + prezzoTitolo); //98.75
		System.out.println("Prezzo intero: " + prezzoIntero); //98
		System.out.println("Prezzo ricostruito: " + prezzoRicostruito); //98.0

	}

}
