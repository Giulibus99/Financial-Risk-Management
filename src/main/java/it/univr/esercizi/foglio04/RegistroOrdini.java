package it.univr.esercizi.foglio04;


/*
 * Esercizio 5 – RegistroOrdini
 */

public class RegistroOrdini {
	
	private static int numeroOrdini = 0;
	private double controvalore;
	
	RegistroOrdini(double controvalore) {
		this.controvalore = controvalore;
		numeroOrdini++;
	}
	
	void leggiControvalore() {
		System.out.println("Il controvalore è: " + this.controvalore);
	}
	public static int leggiNumeroOrdini() {
		return numeroOrdini;
	}

}
