package it.univr.esercizi.foglio04;

/*
 * Esercizio 5 – RegistroOrdini main
 */

public class Esercizio05 {

	public static void main(String[] args) {
		RegistroOrdini ordine1 = new RegistroOrdini(100);
		RegistroOrdini ordine2 = new RegistroOrdini(250);
		RegistroOrdini ordine3 = new RegistroOrdini(180);
		
		System.out.println("Il numero di ordini è: " + RegistroOrdini.leggiNumeroOrdini());
		ordine1.leggiControvalore();
		ordine2.leggiControvalore();
		ordine3.leggiControvalore();

	}

}
