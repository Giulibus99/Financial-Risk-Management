package it.univr.esercizi.foglio03;

/*
 * Esercizio 10
 */

public class PrezzoRiferimento {
	
	private double prezzoMercato;
	private double prezzoChiusura;
	private boolean mercatoAperto;
	
	private void configura(double prezzoMercato, double prezzoChiusura, boolean mercatoAperto) {
		this.prezzoMercato = prezzoMercato;
		this.prezzoChiusura = prezzoChiusura;
		this.mercatoAperto = mercatoAperto;
	}
	
	private double leggiPrezzoUsato() {
		return this.mercatoAperto ? this.prezzoMercato :  this.prezzoChiusura;
	}

	public static void main(String[] args) {
		PrezzoRiferimento prezzo1 = new PrezzoRiferimento();
		PrezzoRiferimento prezzo2 = new PrezzoRiferimento();
		prezzo1.configura(102, 100, true);
		prezzo2.configura(102, 100, false);
		
		double prezzoCorretto1 = prezzo1.leggiPrezzoUsato();
		double prezzoCorretto2 = prezzo2.leggiPrezzoUsato();
		System.out.println("Prezzo usato 1: " + prezzoCorretto1);
		System.out.println("Prezzo usato 2: " + prezzoCorretto2);
		
	}

}
