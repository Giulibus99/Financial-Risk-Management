package it.univr.esercizi.foglio04;

/*
 * Esercizio 2: DepositoVincolato 
 */

public class DepositoVincolato {

	private double capitale;
	private double tasso;
	
	DepositoVincolato(double capitale, double tasso) {
		this.capitale = capitale;
		this.tasso = tasso;
	}
	
	DepositoVincolato(double capitale) {
		this(capitale, 0.02);
	}
	
	double interesseAnnuo() {
		return this.capitale * this.tasso;
	}
	
	

}
