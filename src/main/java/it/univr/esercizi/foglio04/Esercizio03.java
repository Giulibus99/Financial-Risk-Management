package it.univr.esercizi.foglio04;

/*
 * Esercizio 3 – CambioValutario main 
 */

public class Esercizio03 {

	public static void main(String[] args) {
		CambioValutario cash = new CambioValutario(1.10);
		
		System.out.println("Cambio senza commissioni: " + cash.converti(100));
		System.out.println("Cambio con commissioni: " + cash.converti(100, 2));
	}

}
