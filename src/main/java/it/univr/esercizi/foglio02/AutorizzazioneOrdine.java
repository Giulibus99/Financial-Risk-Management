package it.univr.esercizi.foglio02;

// Esercizio 04

public class AutorizzazioneOrdine {

	public static void main(String[] args) {
		boolean mercatoAperto = true;
		int capitaleDisponibile = 4000;
		int costoOrdine = 3500;
		
		boolean capitaleSufficiente = (capitaleDisponibile >= costoOrdine);
		
		System.out.println("Mercato aperto: " + mercatoAperto);
		System.out.println("Capitale sufficiente: " + capitaleSufficiente);
		
		if (capitaleSufficiente && mercatoAperto) {
			System.out.println("Ordine autorizzato");
		} else {
			System.out.println("Ordine non aurtorizzato");
		}

	}

}
