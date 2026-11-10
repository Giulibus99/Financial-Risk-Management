package it.univr.esercizi.foglio02;

// Esercizio 01

public class CapitaleSufficiente {

	public static void main(String[] args) {
		int capitaleDisponibile = 5000;
		int costoOperazione = 3200;
		
		System.out.println("Capitale disponibile: " + capitaleDisponibile);
		System.out.println("Costo operazione: " +  costoOperazione);
		if (capitaleDisponibile >= costoOperazione) {
			System.out.println("L'ordine può essere eseguito");
		}
		
	}

}
